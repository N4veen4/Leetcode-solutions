// Last updated: 14/07/2026, 14:50:05
class Solution {
    public int[] shortestToChar(String s, char c) {

        int n=s.length();
        int[] arr=new int[n];

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            
            if(c == s.charAt(i)){
                list.add(i);
            }
        }

        for(int i=0;i<s.length();i++){

            int min=Integer.MAX_VALUE;
            for(int num:list){
                int cur = Math.abs(num-i);
                min = Math.min(min,cur);
            }
            arr[i]=min;
        }

       // System.out.print(Arrays.toString(arr));
        return arr;

    }
}