class Solution {

    int KthMissingElement(int arr[], int k) {
        for(int i=0;i<arr.length-1;i++){
           int current =arr[i];
           int next = arr[i+1];
           
           int missing = next-current-1;
           if(k<=missing){
               return current+k;
           }
           k-=missing;
        }
        
        return -1;
    }
}
