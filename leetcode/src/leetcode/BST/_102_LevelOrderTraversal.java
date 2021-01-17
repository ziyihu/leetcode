package leetcode.BST;

public class _102_LevelOrderTraversal {
	 List<List<Integer>> result = new LinkedList<>();
	    List<Integer> oneResult = new LinkedList<>();
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        if(root==null) return result;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        while(!queue.isEmpty()){
	            int curLayerNodeCounts = queue.size();
	            oneResult.clear();
	            for(int i = 0; i < curLayerNodeCounts; i++) {
	                TreeNode cur = queue.poll();
	                oneResult.add(cur.val);
	                if(cur.left!=null) queue.offer(cur.left);
	                if(cur.right!=null) queue.offer(cur.right);
	            }
	            result.add(new LinkedList<>(oneResult));
	        }
	        return result;
	    }
}
