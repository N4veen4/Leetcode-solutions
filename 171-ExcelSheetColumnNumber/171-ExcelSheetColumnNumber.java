// Last updated: 14/07/2026, 14:51:28
class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;

        for(char c : columnTitle.toCharArray()){

            int val = c-'A'+1;
            result=result*26+val;
        }
        return result;
    }
}