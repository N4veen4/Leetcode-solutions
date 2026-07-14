// Last updated: 14/07/2026, 14:50:47
class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb=new StringBuilder();
        String vowl="aeiouAEIOU";

        for(Character c:s.toCharArray()){
            if(vowl.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        StringBuilder val=new StringBuilder(s);

        for(int i = 0 ; i < s.length() ; i++){

            if(vowl.contains(String.valueOf((s.charAt(i))))){
                val.setCharAt(i,sb.charAt(sb.length()-1));
                sb.deleteCharAt(sb.length()-1);
            }
        }


        String ss = val.toString();
        return ss;
    }
}