// Last updated: 14/07/2026, 14:50:08
class Solution {
   
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        char[] arr=s.toCharArray();
        int limit=arr.length;
        return arrayToStr(arr,goal,limit,0);
    }
    public static boolean arrayToStr(char[] arr,String goal,int limit,int index){
        
        if(index>limit) return false;
        char firstch=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] =arr[i];
        }
        arr[arr.length-1]=firstch;
        String word=String.valueOf(arr);
        if(word.equals(goal)) return true;
    
    else{
            return arrayToStr(arr,goal,limit,index+1);
        }

        
    }
    
}