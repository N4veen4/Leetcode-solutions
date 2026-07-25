// Last updated: 25/07/2026, 20:26:01
1class Solution {
2    public String multiply(String num1, String num2) {
3        
4       int n=num1.length();
5        int m=num2.length();
6        int[] pos=new int[m+n];
7
8        for(int i=n-1;i>=0;i--){
9            for(int j=m-1;j>=0;j--){
10                
11                int new_carry=i+j;
12                int cur_carry=i+j+1;
13                int mul= (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
14                int sum= mul + pos[cur_carry];
15
16                pos[new_carry] += sum/10;
17                pos[cur_carry] = sum%10;
18            }
19        }
20            StringBuilder sb=new StringBuilder();
21            for(int p:pos){
22                if((sb.length()!=0 || p != 0)){
23                    sb.append(p);
24                }
25            }
26        return sb.length()==0 ? "0":sb.toString();
27    }
28}
29   