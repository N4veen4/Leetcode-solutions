// Last updated: 14/07/2026, 14:49:15
class Solution {
    public String largestGoodInteger(String num) {
      /*  List<Integer> list=new ArrayList<>();
        int count =0;
        
        char[] arr= num.toCharArray();
        for(int i=0;i<num.length()-3;i++){
            if(arr[i] == arr[i+1] && arr[i] == arr[i+2]){ 
                list.add(arr[i]-'0');
            }
        }
        if(list.isEmpty()) return "";
      
        Collections.sort(list);

           int last_val=list.get(list.size()-1);
           String res=""+last_val+last_val+last_val;
           return res;
        }*/

        String[] c ={"999","888","777","666","555","444","333","222","111","000"};

        for(String str: c){
            if(num.contains(str)) return str;
        }
        return "";

    }
}










  /*for(int i=0;i<num.length();i++){
            count=1;
           // char val=arr[i];
            for(int j=0;j<num.length();j++){
                //if(val==arr[j]){
                    if(num[j] == num[j+1]){
                    count++;
                
            if(count>=3){
                list.add(val-'0');
            }
        }*/