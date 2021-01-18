package leetcode.BST;

public class _107_LevelOrderReverse {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root==null) return result;
        queue.offer(root);
        int queueSize = 0;
        List<Integer> oneResult = new LinkedList<>();
        while(!queue.isEmpty()) {
            queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                TreeNode cur = queue.poll();
                oneResult.add(cur.val);
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            result.add(new LinkedList<>(oneResult));
            oneResult.clear();
        }
        Collections.reverse(result);
        return result;
    }
}
