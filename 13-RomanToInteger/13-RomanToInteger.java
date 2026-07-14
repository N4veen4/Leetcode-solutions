// Last updated: 14/07/2026, 14:52:30
class Solution {
    public int romanToInt(String s) {
                HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans =0;
        int y=0;

        for(int i= s.length()-1;i>=0;i--){
            int x=hm.get(s.charAt(i));
            if (x>=y) ans+=x;
            else ans-=x;
            y=x;
        }
        return ans;
    }
}
    
