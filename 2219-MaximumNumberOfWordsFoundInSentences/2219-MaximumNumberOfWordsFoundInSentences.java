// Last updated: 14/07/2026, 14:49:21
class Solution {
    int index=-1;
    int maxcount=0;
    public int mostWordsFound(String[] sentences) {

        index++;
        
        int size=sentences.length-1;

       if(index > size) return maxcount;
        
        int count=maxWord(sentences[index]);
        if(count>maxcount){
            maxcount=count;
        }
     return  mostWordsFound(sentences);
    }


    public int maxWord(String sen){
        int res=0;
        String[] arr=sen.split(" ");

        res=arr.length;
        return res;
    }
}