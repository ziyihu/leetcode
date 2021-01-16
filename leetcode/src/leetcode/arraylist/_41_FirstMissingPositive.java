package leetcode.arraylist;

public class _41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0 || nums==null) return 1;
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = -1;
                continue;
            }
            if(nums[i]!=nums[nums[i]-1]) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
                if(i==nums.length-1) break;
                i--;
            }
        }
        for(int i = 0; i < nums.length;i++) {
            if(nums[i]!=(i+1)) return i+1;
        }
        return nums.length+1;
    }
}
