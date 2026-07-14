// Last updated: 14/07/2026, 14:50:43
class Solution {
    public int firstUniqChar(String s) {

     HashMap<Character, Integer> map= new LinkedHashMap<>();

        for(char c: s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        
        
     
        return -1;
    }
}