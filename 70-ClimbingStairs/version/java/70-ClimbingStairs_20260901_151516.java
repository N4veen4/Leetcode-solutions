// Last updated: 01/09/2026, 15:15:16
1class Solution {
2    public int climbStairs(int n) {
3       
4       int a=1;
5       int b=2;
6       int c=3;
7
8       if(n <= 3){
9        return n;
10       }
11
12       for(int i=4;i<=n;i++){
13
14        a=b;
15        b=c;
16        c=a+b;
17       }
18       return c;
19    }
20}