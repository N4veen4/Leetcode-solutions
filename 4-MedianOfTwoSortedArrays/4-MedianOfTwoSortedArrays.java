// Last updated: 14/07/2026, 14:52:35
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
      int size1=nums1.length;
      int size2=nums2.length;
      int len=size1+size2;
      

      int arr[]=new int[len];
      int i=0,n1=0,n2=0;
      while(n1<size1 && n2<size2){
        if(nums1[n1] <= nums2[n2]){
            arr[i++] = nums1[n1++];
        }
        else{
          
            arr[i++] = nums2[n2++];
        }
      }
        while(n1<size1){
            arr[i++] = nums1[n1++];
        }
        while(n2<size2){
            arr[i++] = nums2[n2++];
        }
      
      if(len%2!=0){
        return arr[len/2];
      }
        return (arr[(len/2) -1]+arr[len/2])/2.0;
      
    
   
    }
    }
