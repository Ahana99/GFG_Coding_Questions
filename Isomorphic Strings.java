class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        
        for(int i=0; i<str1.length();i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if(m1.containsKey(c1) && m1.get(c1)!=c2){
                return false;
            }
            else if(m2.containsKey(c2) && m2.get(c2)!=c1){
                return false;
            }
            
            m1.put(c1,c2);
            m2.put(c2,c1);
        }
        
        return true;
        
    }
}