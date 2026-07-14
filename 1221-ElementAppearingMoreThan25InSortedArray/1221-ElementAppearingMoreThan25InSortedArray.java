// Last updated: 14/07/2026, 14:49:53
class Solution {
    public int findSpecialInteger(int[] arr) {
        
        HashMap<Integer,Integer> freq=new HashMap<>();

        int n=arr.length;

        for(int val : arr){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> access : freq.entrySet()){

            if(access.getValue() > n/4){
                return access.getKey();
            }
        }
        return -1;
    }
}