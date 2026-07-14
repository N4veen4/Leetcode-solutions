// Last updated: 14/07/2026, 14:52:13
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> set=new HashMap<>();

        for(String s:strs){

            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String repl=new String(arr);

            if(!set.containsKey(repl)){
                set.put(repl,new ArrayList<>());
            }
            
            set.get(repl).add(s);

        }
        return new ArrayList<>(set.values());

    }
}