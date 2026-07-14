// Last updated: 14/07/2026, 14:48:51
class Solution {
    public int countKeyChanges(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length()-1;i++){

            if(Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[i+1]) ){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}