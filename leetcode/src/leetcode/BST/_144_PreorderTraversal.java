package leetcode.BST;

public class _144_PreorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // if(root==null) return result;
        // if(root!=null) result.add(root.val);
        // if(root.left!=null) preorderTraversal(root.left);
        // if(root.right!=null) preorderTraversal(root.right);
        // return result;
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if(cur.right!=null) stack.push(cur.right);
            if(cur.left!=null) stack.push(cur.left);
        }
        return result;
    }
}
