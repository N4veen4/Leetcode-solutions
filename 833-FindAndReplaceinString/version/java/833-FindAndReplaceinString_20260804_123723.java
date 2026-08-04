// Last updated: 04/08/2026, 12:37:23
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        
4        int rightZeroes=0;
5
6        for(char ch:s.toCharArray()){
7
8            if(ch=='0'){
9                rightZeroes++;
10            }
11        }
12
13        int leftOnes=0;
14        int ans=rightZeroes;
15
16        for(char ch:s.toCharArray()){
17
18            if(ch == '0'){
19                rightZeroes--;
20            }else{
21                leftOnes++;
22            }
23
24            ans=Math.min(ans,leftOnes+rightZeroes);
25        }
26        return ans;
27    }
28}