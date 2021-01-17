package leetcode.BST;

public class _94_InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();  //left leaf
            res.add(curr.val);   //add current leaf
            curr = curr.right;   //move to its right leaf
        }
        return res;
    }
}
