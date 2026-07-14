// Last updated: 14/07/2026, 14:50:31
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String strDouble=s+s;
        String trim=strDouble.substring(1,strDouble.length()-1);
        return (trim.contains(s));
        //if(trim.contains(s)) return true;
        // else return false;
    }
}





/*
        for(int i=1;i<s.length();i++){
            String subStr=s.substring(0,i);

            if(s.length() %i == 0){
                String str="";
                for(int j=0; j<s.length()/i;j++){
                     str+=subStr+"";
                }
                if(s.contains(str)) return true;
            }
        }
        return false;
    }
}*/