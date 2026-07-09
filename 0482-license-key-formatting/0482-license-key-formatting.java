class Solution {
    public String licenseKeyFormatting(String s, int k) {
        

        String clean=s.replaceAll("-","");
        clean=clean.toUpperCase();

        StringBuilder sb=new StringBuilder();
        int size=0;
        for(int n=clean.length()-1;n>=0;n--){

            if(size == k && n >=0){
                sb.append("-");
                size=0;
            }
            sb.append(clean.charAt(n));
            size++;
        }
        
        return sb.reverse().toString();



    }
}