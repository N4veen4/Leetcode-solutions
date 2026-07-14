// Last updated: 14/07/2026, 14:50:00
class Solution {
    public String reverseOnlyLetters(String s) {
        
        int len=s.length();
        if(s==null || len == 0){
            return "";
        }

        int left=0;
        int right=len-1;
        char[] arr=s.toCharArray();

        while(left < right){

            if(Character.isLetter(arr[left]) && Character.isLetter(arr[right])){

                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
            if(!Character.isLetter(arr[left]) ){
                left++;
            }
            if(!Character.isLetter(arr[right]) ){
                right--;
            }
        }
        return new String(arr);
    }
}