package leetcode.arraylist;

public class _42_TrappingRainWater {
    public int trap(int[] height) {
        if(height==null || height.length < 3) return 0;
        int leftMax = 0;
        int rightMax = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int res = 0;
        while(rightIndex > leftIndex) {
            if(height[leftIndex] < height[rightIndex]) {
                leftMax = Math.max(leftMax, height[leftIndex]);
                res += leftMax - height[leftIndex];
                leftIndex++;
            } else {
                rightMax = Math.max(rightMax, height[rightIndex]);
                res += rightMax - height[rightIndex];
                rightIndex--;
            }
        }
        return res;
    }
}
