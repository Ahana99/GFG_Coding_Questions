class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(char c: s1.toCharArray()){
            freq.put(c, (freq.getOrDefault(c, 0)+1));
        }
        
        for(char c: s2.toCharArray()){
            freq.put(c, (freq.getOrDefault(c, 0)-1));
        }
        
        int count = 0;
        for(int f: freq.values()){
            if(f>0){
                count+=f;
            }
        }
        
        return count<=k;
    }
}