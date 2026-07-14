// Last updated: 14/07/2026, 14:49:38
class Solution {
    public int maxVowels(String s, int k) {
        
        int left=0;
        int max_vol=0;
        int win_vol=0;

        for(int r=0;r<s.length();r++){

            char c=s.charAt(r);

            if(isvowel(c)){
                win_vol++;
               // System.out.print(c+" "+win_vol);
            }

            if(r - left + 1 == k){
               // System.out.println();
                //System.out.println(win_vol+">"+max_vol);
                if(win_vol > max_vol) max_vol=win_vol;
                if(isvowel(s.charAt(left))){
                    win_vol--;
                }
                left++;
            }
        }
        return max_vol;
    }
    public static boolean isvowel(char c){

        if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u') return true ;
        return false;
    }
}