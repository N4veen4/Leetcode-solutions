// Last updated: 12/08/2026, 12:20:30
1class Solution {
2    public int maxVowels(String s, int k) {
3        
4        int left=0;
5        int max_vol=0;
6        int win_vol=0;
7
8        for(int r=0;r<s.length();r++){
9
10            char c=s.charAt(r);
11
12            if(isvowel(c)){
13                win_vol++;
14               // System.out.print(c+" "+win_vol);
15            }
16
17            if(r - left + 1 == k){
18               // System.out.println();
19                //System.out.println(win_vol+">"+max_vol);
20                if(win_vol > max_vol) max_vol=win_vol;
21                if(isvowel(s.charAt(left))){
22                    win_vol--;
23                }
24                left++;
25            }
26        }
27        return max_vol;
28    }
29    public static boolean isvowel(char c){
30
31        if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u') return true ;
32        return false;
33    }
34}