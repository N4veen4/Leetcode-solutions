// Last updated: 14/07/2026, 14:50:34
        
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int l=0;
        int k = p.length();
        List<Integer> list=new ArrayList<>();
        int[] freq_p=new int[26];

        for(int i=0;i<p.length();i++){
            freq_p[p.charAt(i)-'a']++;
        }
        int freq_win[] =new int[26];
        for(int r=0;r<s.length();r++){

            freq_win[s.charAt(r)-'a']++;

            if( r - l + 1 == k ){
                
                if(find_ana(freq_win,freq_p)){
                    list.add(l);
                }
                freq_win[s.charAt(l)-'a']--;
                l++;
                
            }
            
        }
        return list;
    }
    public static boolean find_ana(int[] freq_win,int[] freq_p){

        for(int i=0;i<freq_win.length;i++){
            if(freq_win[i] != freq_p[i]) return false;
        }
        return true;
    }
}