// Last updated: 14/07/2026, 14:49:16
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        return replaceCoprime(nums);
        
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public static List<Integer> replaceCoprime(int[] nums){
        Stack<Integer> stack=new Stack<>();
        for(int num:nums){
        while (!stack.isEmpty()) {
    int top = stack.peek();
    int gcd = gcd(top, num);

    
    if (gcd > 1) {
        num = lcm(top, num);
        stack.pop();
    } else {
        break;
    }
}
stack.push(num);
    }
        List<Integer> result=new ArrayList<>(stack);
        return result;
    }
}