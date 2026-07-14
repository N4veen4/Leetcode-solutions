// Last updated: 14/07/2026, 14:51:51
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<numRows;i++){

            List<Integer> row=new ArrayList<>();

            int num=1;

            for(int j=0;j<=i;j++){
                row.add(num);
                num=num*(i-j)/(j+1);
            }
            pascal.add(row);
        }

        return pascal;
    }
}