// Last updated: 14/07/2026, 14:51:43
class Solution {
    public boolean isPalindrome(String s) {

           char[] arr=s.toCharArray();
        int count=0;
        for(int i =0;i < arr.length;i++){
            if(arr[i]>64 && arr[i]<91 || arr[i]>=97 && arr[i]<123 || arr[i]>47 && arr[i]<58){
                count++;
            }
        }

        char[] store=new char[count];
        int storecount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>64 && arr[i]<91 || arr[i]>=97 && arr[i]<123  || arr[i]>47 && arr[i]<58){
                
                store[storecount]=arr[i];
                storecount++;
            } 
        }
        char[] arr1=new char[count];
        int in=0;
         for(int i=store.length-1;i>=0;i--){
            
                arr1[in]=store[i];
                in++;
            
         }
         
        String l=Arrays.toString(store);
        String c=Arrays.toString(arr1);

         return(l.equalsIgnoreCase(c));
          
}
}