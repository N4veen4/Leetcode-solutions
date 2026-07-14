// Last updated: 14/07/2026, 14:49:51
class Solution {
    int index=-1;
    int res=0;
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans=0;

        String[] str=text.split(" ");
        checking(str,brokenLetters);
        ans=str.length-res;
        return ans;
        
    }
    public void checking(String[] str1,String brokenLetters){
        index++;
        if(index >=str1.length) return;
        brokenCheck(str1[index],brokenLetters);
    checking(str1,brokenLetters);
        
    }
    public void brokenCheck(String word,String brokenLetters){
        for(char ch: brokenLetters.toCharArray()){
            for(int i=0;i<word.length();i++){
                if(ch==word.charAt(i)){
                    res++;
                    return;
                }
            }
        }
    }
}