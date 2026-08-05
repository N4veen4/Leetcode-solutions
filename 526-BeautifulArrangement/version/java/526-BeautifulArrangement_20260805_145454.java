// Last updated: 05/08/2026, 14:54:54
1class NumArray {
2
3    private int[] prefix;
4    public NumArray(int[] nums) {
5        int n=nums.length;
6        prefix=new int[n+1];
7        prefix[0]=0;
8
9        for(int i=1;i<=n;i++){
10            prefix[i]=nums[i-1]+prefix[i-1];
11        }
12    }
13    
14    public int sumRange(int left, int right) {
15        
16        return prefix[right+1]- prefix[left];
17    }
18}
19
20/**
21 * Your NumArray object will be instantiated and called as such:
22 * NumArray obj = new NumArray(nums);
23 * int param_1 = obj.sumRange(left,right);
24 */