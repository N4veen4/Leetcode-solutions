class Solution {
    public String multiply(String num1, String num2) {
        
       int n=num1.length();
        int m=num2.length();
        int[] pos=new int[m+n];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                
                int new_carry=i+j;
                int cur_carry=i+j+1;
                int mul= (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int sum= mul + pos[cur_carry];

                pos[new_carry] += sum/10;
                pos[cur_carry] = sum%10;
            }
        }
            StringBuilder sb=new StringBuilder();
            for(int p:pos){
                if((sb.length()!=0 || p != 0)){
                    sb.append(p);
                }
            }
        return sb.length()==0 ? "0":sb.toString();
    }
}
   