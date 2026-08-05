// Last updated: 05/08/2026, 13:54:42
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        HashMap<Integer,Integer> set=new HashMap<>();
5
6        for(int i=0;i<numbers.length;i++){
7
8            int val = target - numbers[i];
9
10            if(set.containsKey(val)){
11                return new int[] {set.get(val),i+1};
12            }else{
13                set.put(numbers[i] , i+1);
14            }
15        }
16
17        return new int[]{};
18    }
19}