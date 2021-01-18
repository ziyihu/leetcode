package leetcode.BST;

public class _108_ConvertSortedArrayToBST {
	  public TreeNode putRoot(int[] nums, int left, int right) {
		    if (left > right) return null;

		    // always choose left middle node as a root
		    int p = (left + right) / 2;

		    TreeNode root = new TreeNode(nums[p]);
		    root.left = putRoot(nums, left, p - 1);
		    root.right = putRoot(nums, p + 1, right);
		    return root;
		  }

		  public TreeNode sortedArrayToBST(int[] nums) {
		    return putRoot(nums, 0, nums.length - 1);
		  }
}
