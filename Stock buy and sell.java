class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        
        int i = 0;
        while(i<n-1){
            while(i<n-1 && A[i]>=A[i+1]){
                i++;
            }
            if(i==n-1){
                break;
            }
            int buy = i++;
            while(i<n && A[i]>=A[i-1]){
                i++;
            }
            
            int sell = i-1;
            
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(buy);
            pair.add(sell);
            result.add(pair);
        }
        
        return result;
    }
}
/**
 * This is Greedy Algorithm where we find the local minima and local maxima
 * Here we find the locally optimal choice and the globally optimal solution
 */