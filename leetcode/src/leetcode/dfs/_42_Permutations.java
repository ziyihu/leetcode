package leetcode.dfs;

public class _42_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        // ArrayList<Integer> curr = new ArrayList<>();
        // curr = Arrays.asList(nums);
        // int[] ints = {1, 2, 3};
        int[] used = new int[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        int[] s = new int[nums.length];
        dfs(0, used, s, result, nums);
        return result;
    }
    public void dfs(int index, int[] used, int[] s, List<List<Integer>> result, int[] nums) {
        if(index==nums.length) {
            List<Integer> intList = new ArrayList<Integer>(s.length);
            for (int i : s) {
                intList.add(i);
            }
            // List<Integer> intList = Arrays.asList(s);
            result.add(intList);
            return;
        }
            for(int i=0; i < nums.length; i++) {
                if(used[i]!=0) continue;
                used[i]=1;
                s[index]=nums[i];
                dfs(index+1, used,s,result, nums);
                used[i]=0;
            }
    }
}
