public class Solution26 {
    // #26
    // Given an integer array nums sorted in non-decreasing order
    // remove the duplicates in-place such that each unique element
    // appears only once. The relative order of the elements should
    // be kept the same. Then return the number of unique elements
    // in nums.
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        temp = nums;

        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[nums.length - 1];

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }

        return j;
    }
}
