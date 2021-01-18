package leetcode.BST;

public class _104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
        
//         int depth = 0;
//         if(root==null) return depth;
//         Queue<TreeNode> queue = new LinkedList<>();
        
//         queue.offer(root);
//         while(!queue.isEmpty()) {
//             int curLevel = queue.size();
//             for(int i = 0; i < curLevel; i++) {
//                 TreeNode cur = queue.poll();
//                 if(cur.left!=null) queue.offer(cur.left);
//                 if(cur.right!=null) queue.offer(cur.right);
//             }
//             depth++;
//         }
//         return depth;
    }
}
