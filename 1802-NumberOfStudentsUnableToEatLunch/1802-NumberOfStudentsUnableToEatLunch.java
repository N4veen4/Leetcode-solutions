// Last updated: 14/07/2026, 14:49:28
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int[] stu_count=new int[2];

        for(int s:students){
            stu_count[s]++;
        }

        for(int sand:sandwiches){
            if(stu_count[sand] == 0){
                return stu_count[0] + stu_count[1];
            }
            stu_count[sand]--;
        }
        return 0;
    }
}