// Last updated: 14/07/2026, 14:49:33
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s1 = attachString(word1);
         String s2 = attachString(word2);

         if(s1.equals(s2)) return true ;
         return false;

    }
    public static String attachString( String[] word){

        String s="";
        for(String str: word){
            s+=str+"";
        }
        return s;
    }

}