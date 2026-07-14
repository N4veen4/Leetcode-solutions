// Last updated: 14/07/2026, 14:50:15
class Solution {
    public int calPoints(String[] operations) {
        
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<operations.length;i++){

            String s=operations[i];
            if(s.equals("C")){
                list.remove(list.size()-1);
            }
            else if(s.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }else if(s.equals("+")){
                list.add(list.get(list.size()-2)+list.get(list.size()-1));
            }else{
                list.add(Integer.parseInt(s));
            }
        }
        int sum =0;
        for(int c:list){
            sum+=c;
        }
        return sum;
    }
}