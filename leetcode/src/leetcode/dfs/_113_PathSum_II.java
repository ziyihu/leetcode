package leetcode.dfs;

public class _113_PathSum_II {
    LinkedList<Integer> result = new LinkedList<>();
    List<List<Integer>> totalResult = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return totalResult;
        result.add(root.val);
        dfs(root.val, sum, root);
        return totalResult;
    }
    public void dfs(int current, int sum, TreeNode curNode){
        if(curNode.left==null && curNode.right==null && current==sum) {
            totalResult.add(new ArrayList<Integer>(result));
            return;
        } 
        if(curNode.left==null && curNode.right==null) {
            return;
        }
        if(curNode.left!=null) {
            result.add(curNode.left.val);
            dfs(current+curNode.left.val, sum, curNode.left);
            result.removeLast();
        }
        if(curNode.right!=null) {
            result.add(curNode.right.val);
            dfs(current+curNode.right.val, sum, curNode.right);
            result.removeLast();
        }
    }
}
