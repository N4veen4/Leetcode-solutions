// Last updated: 14/07/2026, 14:48:43
class Solution {
    public int findClosest(int x, int y, int z) {

        int pos_1 =  distanceFind(x,z);
        int pos_2 =  distanceFind(y,z);
        if(pos_1 == pos_2) return 0;
        if(pos_1 < pos_2){
        return 1;
    }
        else {
            return 2;
        }
        
        
    }
    public int distanceFind(int cur_pos,int des){

        int count=0;
        if(cur_pos <des){
            while(cur_pos!=des){
                cur_pos++;
                count+=1;
            }
        }
        else{
            while(cur_pos!=des){
                cur_pos--;
                count+=1;
            }
        }
        return count;
    }
}