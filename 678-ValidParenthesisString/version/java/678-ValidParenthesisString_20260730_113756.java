// Last updated: 30/07/2026, 11:37:56
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3       
4       StringBuilder sb=new StringBuilder();
5
6       while(a > 0 || b > 0){
7
8        if(a>b){
9            if(a>1){
10                sb.append("aa");
11                a-=2;
12            }else{
13                sb.append("a");
14                a--;
15            }
16            if(b>0){
17                sb.append("b");
18                b--;
19            }
20        }
21        else if(b>a){
22            if(b>1){
23                sb.append("bb");
24                b-=2;
25            }else{
26                sb.append("b");
27                b--;
28            }
29            if(a>0){
30                sb.append("a");
31                a--;
32            }
33        }else{
34            sb.append("ab");
35            a--;
36            b--;
37        }
38       }
39
40       return sb.toString();
41    }
42}