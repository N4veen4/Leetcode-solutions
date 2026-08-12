class Solution {
    public int maxVowels(String s, int k) {
        char chars[] = s.toCharArray();
        int cur_count = 0;
        int maxVowels = 0;
        String vowel="aeiou";

        for(int i=0; i<k; i++) {
            if(vowel.indexOf(chars[i]) != -1) {
                cur_count++;
            }
        }
        maxVowels = cur_count;
        if(maxVowels == k) return k;
        for(int i=k; i<chars.length; i++) {
            if(vowel.indexOf(chars[i]) != -1) {
                cur_count++;
            }
            if(vowel.indexOf(chars[i-k]) != -1) {
                cur_count--;
            }
            if(cur_count > maxVowels) {
                maxVowels = cur_count;
                if(maxVowels == k) return k;
            }
        }
        return maxVowels;
    }
   
}