// Last updated: 14/07/2026, 14:50:41
class Solution {
    public char findTheDifference(String s, String t) {
        char ch='c';
        //if(s.length()==t.length()+1){
            int val1=valueFind(s);
            int val2=valueFind(t);
            int res=Math.abs(val1-val2);
            char ans=(char) res;
            return ans;
        //}
        //return ch;
    }
    public int valueFind(String word){
        int val=0;
        for(char ch:word.toCharArray()){
            val+=ch+0;
        }
        return val;
    }
}