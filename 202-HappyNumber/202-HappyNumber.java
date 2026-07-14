// Last updated: 14/07/2026, 14:51:21
class Solution {
    public boolean isHappy(int n) {
        
        int num=n;

        if(num<=0) return false;

        HashSet<Integer> seen=new HashSet<>();

        while(num!= 1){
            if(seen.contains(num)) return false;
        
        else{
            seen.add(num);
            num = happyNum(num);
        }
        }
        return true;
    }

    public int  happyNum(int num){

        
        int res=0;
        while(num>0){
            int last=num%10;
            res+=last*last;
            num=num/10;
        }
        
        return res;
    }
}
