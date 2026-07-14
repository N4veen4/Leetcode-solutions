// Last updated: 14/07/2026, 14:52:28
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        Arrays.sort(nums);  // Sort the array first

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;  // Start with the next element
            int right = nums.length - 1;  // Start from the last element

            // Use two pointers to find the other two numbers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {  // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move the left pointer to skip duplicate values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Move the right pointer to skip duplicate values
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Increase the sum by moving the left pointer
                } else {
                    right--;  // Decrease the sum by moving the right pointer
                }
            }
        }

        return result;
    }
}
