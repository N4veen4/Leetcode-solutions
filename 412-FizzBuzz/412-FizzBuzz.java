// Last updated: 14/07/2026, 14:50:37
class Solution {
    public List<String> fizzBuzz(int n) {

        String[] val= new String[n];
        List<String> list=new ArrayList<>();

        for(int i=1;i<=n;i++){

            if(i%3 == 0 && i%5==0){
                val[i-1]="FizzBuzz";
            }else if(i%3==0){
                val[i-1]="Fizz";
            }else if(i%5==0){
                val[i-1]="Buzz";
            }else{
                val[i-1]=String.valueOf(i);
            }
        } 
        for(int i=0;i<n;i++){
           list.add(val[i]);
        }

        return list;
    }
}