public class Solution27 {
    // #27
    // Given an integer array nums and an integer val
    // remove all occurances of val in nums in-place.
    // Return the number of elements in nums which are
    // not equal to val.
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
