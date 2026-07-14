// Last updated: 14/07/2026, 14:50:23
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int k = s1.length();
        int l=0;

         int[] freq_s1=new int[26];

         for(int i=0;i<s1.length();i++){
            freq_s1[s1.charAt(i)-'a']++;
         }

         int[] freq_win = new int[26];

         for(int r=0;r<s2.length();r++){

            freq_win[s2.charAt(r)-'a']++;

            if(r-l+1==k){
                if(find_ana(freq_win , freq_s1)){
                    return true ;
                }
                freq_win[s2.charAt(l)-'a']--;
                l++;
            }
         }
         return false;
    }

    public static boolean find_ana(int[] freq_win,int[] freq_s1){

        for(int i=0;i<freq_win.length;i++){
            if(freq_win[i] != freq_s1[i]) return false;
        } 
        return true;
    }
   
}