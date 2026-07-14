// Last updated: 14/07/2026, 14:50:49
class Solution {
    public void reverseString(char[] s) {
        
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(s));
    }
}