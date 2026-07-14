// Last updated: 14/07/2026, 14:48:54
class Solution {
    int index=-1;
    int count = -1;
    List<Integer> list=new ArrayList<>();
    public List<Integer> findWordsContaining(String[] words, char x) {

        

            index++;

            if(index>=words.length) return list;

            if(findChar(words[index],x)){
                list.add(index);
            }

            findWordsContaining(words, x);
            return list;
    }
    public boolean findChar(String s,char x){
        count++;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == x) return true;
        }
        return false;
        }
    }
    
