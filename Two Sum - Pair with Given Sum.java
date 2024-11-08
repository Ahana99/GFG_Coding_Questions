

// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
      
        HashSet<Integer> sum = new HashSet<>();
        for(int num: arr){
            if(sum.contains(target-num)){
                return true;
            }
            sum.add(num);
        }
        return false;
    }
}