// Last updated: 14/07/2026, 14:50:02
class Solution {
    public int[] sortArray(int[] nums) {
        
      split(nums);
        return nums;
        

    }
    public static void split(int[] arr){

        if(arr.length <= 1) return ;

        int mid= arr.length/2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[arr.length-mid];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(i<mid){
                leftarr[i]=arr[i];
            }else{
                rightarr[j] = arr[i];
                j++;
            }
        }
        split(leftarr);
        split(rightarr);
        merge(leftarr,rightarr,arr);
    }
    public static int[] merge(int[] leftarr,int[] rightarr,int[] arr){
        int lsize = arr.length/2;
        int rsize = arr.length- lsize;
        int i=0,l=0,r=0;

        while(l<lsize && r<rsize){
            if(leftarr[l] < rightarr[r]){
                arr[i] = leftarr[l];
                i++;
                l++;
            }else{
                arr[i] = rightarr[r];
                i++;
                r++;
            }
        }

        while(l<lsize){
            arr[i] = leftarr[l];
            l++;
            i++;
        }
        while(r<rsize){
            arr[i] = rightarr[r];
            r++;
            i++;
        }
        return arr;

    }
}