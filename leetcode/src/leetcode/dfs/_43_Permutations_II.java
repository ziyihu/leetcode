package leetcode.dfs;

public class _43_Permutations_II {
	   List<List<Integer>> res = new ArrayList<>();
	    public List<List<Integer>> permuteUnique(int[] nums) {
	        dfs(0, nums);
	        return res;
	    }
	    
	    public void dfs(int index, int[] nums){
	        if(index == nums.length) {
	            List<Integer> resList = new ArrayList<>();
	            for(int value: nums) {
	                resList.add(value);
	            }
	            res.add(resList);
	            return;
	        }
	        for(int i = index; i < nums.length; i++) {
	            if(seenBefore(index,i,nums)) continue;
	            swap(index,i,nums);
	            dfs(index+1, nums);
	            swap(index,i,nums);
	        }
	    }
	    public boolean seenBefore(int index, int i, int[] nums) {
	        for(int j = index; j < i; j++) {
	            if(nums[j]==nums[i]) return true;
	        }
	        return false;
	    }
	    public void swap(int index, int i, int[] nums) {
	        int temp = nums[index];
	        nums[index] = nums[i];
	        nums[i] = temp;
	    }
}
