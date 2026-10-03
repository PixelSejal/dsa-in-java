package Arrays.twopointers;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0; // position for unique elements

        for (int right = 1; right < nums.length; right++) {
            // If current element is different from previous unique
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right]; // place it at next unique position
            }
        }

        return left + 1; // length of unique elements
    }
}
