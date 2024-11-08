// User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        S = String.join("", S.split("-")).toUpperCase();
        StringBuilder sb = new StringBuilder();
        int index=0;
        for(int i = S.length()-1; i>=0; i--){
            sb.append(S.charAt(i));
            index++;
            if(i!=0 && index==K){
                 sb.append('-');
                 index=0;
            }
            
        }
        return sb.reverse().toString();
    }
}