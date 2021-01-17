package leetcode.BST;

public class _145_PostorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // if(root==null) return result;
        // if(root.left!=null) postorderTraversal(root.left);
        // if(root.right!=null) postorderTraversal(root.right);
        // result.add(root.val);
        // return result;
        
        LinkedList<Integer> output = new LinkedList();
        Stack<TreeNode> stack = new Stack();
        
        if (root == null) return output;

        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            output.addFirst(root.val);
            if (root.left != null) stack.push(root.left);
            if (root.right != null) stack.push(root.right);
        }

        return output;
    }
}
