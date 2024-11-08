class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num:arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        
        int largestNum = Integer.MIN_VALUE;
        int minimumFreq = Integer.MAX_VALUE;
        
        for(int f: freqMap.values()){
            minimumFreq = Math.min(f, minimumFreq);
        }
        
        for(int num: freqMap.keySet()){
            if(freqMap.get(num)==minimumFreq){
                largestNum = Math.max(largestNum, num);
            }
        }
        
        return largestNum;
    }
}