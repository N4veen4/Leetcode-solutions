// Last updated: 14/07/2026, 14:49:31
class Solution {
    int index=-1;
    int count=0;
    public int countConsistentStrings(String allowed, String[] words) {
        index++;
        if(index>words.length-1) return count;
        
        boolean n=wordconsistent(allowed,words[index]);
            if(n){
            count++;
            }
        countConsistentStrings(allowed,words);
        return count;
    }
    public static boolean wordconsistent(String allowed,String str){

        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(allowed.indexOf(ch[i])==-1) return false;
        }
        return true;
        
    }
}