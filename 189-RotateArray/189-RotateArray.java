// Last updated: 14/07/2026, 14:51:23
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // if k > n, reduce it
        k = k % n;

        // Step 1: reverse full array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // helper function to reverse array
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}