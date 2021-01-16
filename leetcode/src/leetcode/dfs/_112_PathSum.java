package leetcode.dfs;

public class _112_PathSum {
    Boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        dfs(root.val, sum, root);
        return result;
    }
    public void dfs(int current, int sum, TreeNode curNode){
        if(curNode.left==null && curNode.right==null && current==sum) {
            result = true;
            return;
        } 
        if(curNode.left==null && curNode.right==null) {
            return;
        }
        if(curNode.left!=null) {
            dfs(current+curNode.left.val, sum, curNode.left);
        }
        if(curNode.right!=null) {
            dfs(current+curNode.right.val, sum, curNode.right);
        }
    }
}
