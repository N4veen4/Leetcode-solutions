// Last updated: 14/07/2026, 14:52:39
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> seen = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int need= target -nums[i];
            if(seen.containsKey(need)) return new int[]{seen.get(need),i};
            else seen.put(nums[i],i);
        }
        return new int[]{};
    }
}