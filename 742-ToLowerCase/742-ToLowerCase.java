// Last updated: 14/07/2026, 14:50:12
class Solution {
    public String toLowerCase(String s) {
        String res="";
        char[] s1=s.toCharArray();
        for(char ch:s1){
            if(ch>64 && ch<91) {
                char cc=(char)(ch+32);
                res+=cc+"";
            }else{
                res+=ch;
            }
        } return res;
    }
}