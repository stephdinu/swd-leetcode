public class Solution1 {
    // #1
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    twoSumArray[0] = i;
                    twoSumArray[1] = j;
                }
            }
        }
        return twoSumArray;
    }
}
