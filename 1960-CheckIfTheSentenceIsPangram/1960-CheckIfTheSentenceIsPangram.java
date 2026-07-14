// Last updated: 14/07/2026, 14:49:24
class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length() < 26) return false;
        int[] freq=new int[26];

        for(char c:sentence.toCharArray()){
            freq[c-'a']++;
        }

        for(int num : freq){
            if(num<=0) return false;
        }
        return true;
    }
}