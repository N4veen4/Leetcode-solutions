// Last updated: 14/07/2026, 14:49:20
class Solution {
     int index=-1;
    public String firstPalindrome(String[] words) {
       
        index++;
        int h=words.length-1;
        if(index > h) return "";
        
        boolean m = find(words[index]);
        if(m){
            return words[index];
        }else{
            return firstPalindrome(words);
        }    
    }
    public boolean find(String word){

            String ori=word;
        String reversed = new StringBuilder(word).reverse().toString();

        if (ori.equals(reversed)) {
           return true;
        } else {
            return false;
        }
    }
}