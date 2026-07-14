// Last updated: 14/07/2026, 14:49:57
class Solution {
    public int fib(int n) {
   
        if (n == 0)  return 0; 
         else if (n == 1) return 1;
        

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;   
            a = temp;     
        }

        return b; 
    }

}
    
