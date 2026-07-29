class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;
        int r=0;
        int longest_sub_string =0;

        int freq[]=new int[256];

        while(r < s.length() && l <= r){

                char ch=s.charAt(r);
                freq[ch]++;                
            
                while(freq[ch] > 1){
                    freq[s.charAt(l)]--;
                    l++;
                }

                longest_sub_string=Math.max(longest_sub_string,r-l+1);
                r++;
        }
        return longest_sub_string;
    }
}