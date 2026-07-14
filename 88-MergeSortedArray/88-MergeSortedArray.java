// Last updated: 14/07/2026, 14:52:00
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int count=-1;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        //sorting

        for(int i=0;i<nums1.length;i++){
            for(int j=i+1; j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    int a=nums1[i];
                    int b=nums1[j];
                    int temp=a;
                    a=b;
                    b=temp;
                    nums1[i]=a;
                    nums1[j]=b;
                }
            }
            
        }
        for(int val:nums1){
            System.out.print(val);
        }
    }
}