// Last updated: 14/07/2026, 14:52:10
class Solution {
    public int lengthOfLastWord(String s) {

        String[] str= s.split(" ");
        int n=str.length;
        return str[n-1].length();
    }
    }








/*
        String[] str= s.split(" ");
        int n=str.length;
        int lastword=n-1;;
        int res=lengthFindString(str[lastword]);
        return res;
    }
    public int lengthFindString(String s){
        int len=s.length();
        return len;
    }
}*/