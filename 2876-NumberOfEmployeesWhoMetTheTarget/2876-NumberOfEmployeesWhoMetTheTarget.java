// Last updated: 14/07/2026, 14:48:57
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int targetmet=0;

        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                targetmet++;
            }
        } 
        return targetmet;
    }
}