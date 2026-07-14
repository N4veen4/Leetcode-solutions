// Last updated: 14/07/2026, 14:49:37
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        
        int ex=0;
        for(int i=1;i<salary.length-1;i++ ){
            
            ex+=salary[i];
            
        }
        return (double)ex/(salary.length-2);
        
    }
}