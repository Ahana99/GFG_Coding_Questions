

// User function Template for Java

class Solution {
    public static String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        if(n==0){
            return "";
        }
        if(n==1){
            return arr[0];
        }
        
        Arrays.sort(arr);
        
        int end = Math.min(arr[0].length(), arr[n-1].length());
        
        String first = arr[0];
        String last = arr[n-1];
        int i =0;
        
        while(i<end && first.charAt(i)==last.charAt(i)){
            i++;
        }
        
        String longPrefix = first.substring(0,i);
        
        return longPrefix.isEmpty()?"-1":longPrefix;
    }
        
}
