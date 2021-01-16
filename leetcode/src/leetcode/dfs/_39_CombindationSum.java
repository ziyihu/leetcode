package leetcode.dfs;

public class _39_CombindationSum {
    LinkedList<Integer> resOneItem = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
       if(candidates == null || candidates.length == 0 ) return res;
       dfs(0, candidates, target, 0, 0);
       return res;
   }
   public void dfs(int current, int[] candidates, int target, int index, int startPosition) {
       if(current > target) return;
       if(current == target) {
           res.add(new ArrayList<Integer>(resOneItem));
           return;
       }
       
       for(int i = startPosition; i < candidates.length; i++) {
           resOneItem.add(candidates[i]);
           dfs(current+candidates[i], candidates, target, index+1, i);
           resOneItem.removeLast();
       }
       return;
   }
}
