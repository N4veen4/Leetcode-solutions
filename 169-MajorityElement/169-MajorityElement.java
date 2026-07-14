// Last updated: 14/07/2026, 14:51:30
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num:nums) {
            if(count==0) {
                candidate = num;
            }
            if(num==candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
