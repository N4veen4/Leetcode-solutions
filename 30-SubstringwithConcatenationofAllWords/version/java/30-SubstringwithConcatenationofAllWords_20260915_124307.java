// Last updated: 15/09/2026, 12:43:07
1class Solution {
2    public int trap(int[] height) {
3        
4        int water=0;
5        int n=height.length;
6
7        int[] lm=new int[n];
8        int[] rm=new int[n];
9
10        lm[0]=height[0];
11         for(int j=1;j<n;j++){
12                lm[j]=Math.max(lm[j-1],height[j]);
13            }
14        
15        rm[n-1]=height[n-1];
16            for(int r=n-2;r>=0;r--){
17                rm[r]=Math.max(rm[r+1],height[r]);
18            }
19
20
21        for(int i=0;i<n;i++){
22            water+=Math.min(lm[i],rm[i])-height[i];
23        }
24
25        return water;
26    }
27}