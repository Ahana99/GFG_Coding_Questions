class Solution {

    public int peakElement(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            boolean left=(mid == 0 || arr[mid]>=arr[mid-1]);
            boolean right=(mid == arr.length-1 || arr[mid]>=arr[mid+1]);
            
            if(left && right){
                return mid;
            } else if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
