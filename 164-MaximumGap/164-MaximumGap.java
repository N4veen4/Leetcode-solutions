// Last updated: 14/07/2026, 14:51:32
class Solution {
    public int maximumGap(int[] nums) {
        
        int l=nums.length;
        if(l<=1 ) return 0;
        split(nums);
        int max=Integer.MIN_VALUE;
        int res = maxDiff(nums,max);
        return res;
        
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
    public int maxDiff(int[] nums,int max){

        for(int i=nums.length-1;i>0;i--){
            int res=nums[i] - nums[i-1];
            if(res>max){
                max=res;
            }
        }return max;
    }
}
