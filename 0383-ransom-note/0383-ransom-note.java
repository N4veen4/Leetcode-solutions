class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] arr1=new int[26];
        

        for(char c:ransomNote.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c:magazine.toCharArray()){
            arr1[c-'a']--;
        }
        for(int n:arr1){
            if(n >=1) return false;
        }
        return true;
    }
}