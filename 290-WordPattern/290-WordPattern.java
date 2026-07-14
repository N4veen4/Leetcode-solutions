// Last updated: 14/07/2026, 14:50:55
class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] arr=pattern.toCharArray();
        String[] sa=s.split(" ");

        if(arr.length!=sa.length){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<sa.length;j++){
                if(arr[i]==arr[j]){
                    if(!sa[i].equals(sa[j])){
                        return false;
                    }
                }
                else if(sa[i].equals(sa[j])){
                    if(arr[i]!=arr[j]){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}