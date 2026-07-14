// Last updated: 14/07/2026, 14:51:18
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        for(int i =0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr1[i]==arr1[j]){
                    if(arr2[i]!=arr2[j]) return false;
                }
                else if(arr2[i]==arr2[j]){
                    if(arr1[i]!=arr1[j]) return false;
                }
            }
            
        }return true;
    }
}