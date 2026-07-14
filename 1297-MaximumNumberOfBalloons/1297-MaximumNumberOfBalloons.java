// Last updated: 14/07/2026, 14:49:48
import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : text.toCharArray()) {
            if ("balloon".indexOf(c) != -1) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; 
        int o = map.getOrDefault('o', 0) / 2; 
        int n = map.getOrDefault('n', 0);

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
