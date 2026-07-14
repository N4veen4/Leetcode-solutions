// Last updated: 14/07/2026, 14:52:20
class Solution {
    public int strStr(String haystack, String needle) {

      int l=0;
      
      int r=0;
      StringBuilder sb=new StringBuilder();

      while(r < haystack.length()){

            sb.append(haystack.charAt(r));

            if(sb.length()>needle.length()){
                sb.deleteCharAt(0);
                l++;
            }

            if(sb.length() == needle.length()){

                if(sb.toString().equals(needle)){
                    return l;
                }
            }
            r++;

      }return -1;
        
    }
}