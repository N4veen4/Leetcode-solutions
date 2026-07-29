// Last updated: 29/07/2026, 12:39:29
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        int l=0;
5        int r=0;
6        int longest_sub_string =0;
7
8        int freq[]=new int[256];
9
10        while(r < s.length() && l <= r){
11
12                char ch=s.charAt(r);
13                freq[ch]++;                
14            
15                while(freq[ch] > 1){
16                    freq[s.charAt(l)]--;
17                    l++;
18                }
19
20                longest_sub_string=Math.max(longest_sub_string,r-l+1);
21                r++;
22        }
23        return longest_sub_string;
24    }
25}