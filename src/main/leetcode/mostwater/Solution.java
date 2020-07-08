package leetcode.mostwater;

public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                max = Math.max(height[left]*(right - left), max);
                left++;
            } else {
                max = Math.max(height[right]*(right - left), max);
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
