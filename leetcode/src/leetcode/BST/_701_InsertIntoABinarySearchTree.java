package leetcode.BST;

public class _701_InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = root;
        while(cur!=null) {
            if(val>cur.val) {
                if(cur.right==null) {
                    cur.right = new TreeNode(val);
                    return root;
                } else {
                    cur = cur.right;
                }
            } else {
                if(cur.left==null) {
                    cur.left = new TreeNode(val);
                    return root;
                } else {
                    cur = cur.left;
                }
            }
        }
        return new TreeNode(val);
    }
}
