// Last updated: 14/07/2026, 14:52:36
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;
        int r=0;
        int longest_sub_string =0;
        int size_win=0;

        int freq[]=new int[256];

        while(r < s.length() && l <= r){

            if(r<s.length()){
                freq[s.charAt(r)]++;
                size_win++;
                }
            
            if(isunique(freq)){
               // System.out.print(longest_sub_string+" "+size_win);
                longest_sub_string=Math.max(longest_sub_string,size_win);
            }else{
                freq[s.charAt(l)]--;
                size_win--;
                l++;
            }
            if(r<s.length()-1){
                r++;
            }
        }
        return longest_sub_string;
    }

    public static boolean isunique(int[] freq){

        for(int i=0;i<freq.length;i++){
            if(freq[i] >=2){
                return false;
            }
        }
        return true;
    }
}