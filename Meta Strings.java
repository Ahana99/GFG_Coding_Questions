class Solution 
{ 
    boolean metaStrings(String S1, String S2) 
    { 
        if(S1.length()!=S2.length() || S1.equals(S2)){
            return false;
        }
        
        int m1=-1, m2=-1;
        for(int i=0; i< S1.length(); i++){
            if(S1.charAt(i)!=S2.charAt(i)){
                if(m1==-1){
                    m1=i;
                }
                else if(m2==-1){
                   m2=i; 
                }
                else{
                    return false;
                }
            }
        }
        if(m2!= -1 && S1.charAt(m1) == S2.charAt(m2) && S1.charAt(m2) == S2.charAt(m1)){
            return true;
        }
        
        return false;
    }
} 