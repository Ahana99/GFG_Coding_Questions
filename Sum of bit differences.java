class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long diff =0;
        for(int i=0;i<32;i++){
            long count_1=0;
            for(int num: arr){
                if((num & (1<<i))!=0){
                    count_1++;
                }
            }
            
            diff += 2 * (n-count_1) * count_1;
        }
        
        return diff;
    }
}