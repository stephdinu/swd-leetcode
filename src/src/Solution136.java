public class Solution136 {
    // #136
    // Given a non-empty array of integers nums,
    // every element appears twice except for one.
    // Find that single one.
    // You must implement a solution with
    // a linear runtime complexity
    // and use only constant extra space.
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution136 solution = new Solution136();
        int[] nums = {4,1,2,1,2};
        System.out.println("The result is:" + solution.singleNumber(nums));
    }
}
