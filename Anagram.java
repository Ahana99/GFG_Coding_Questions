

// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        int n = arr.size();
        int j=0;
         for (int i = 1; i < arr.size(); i++) {
            // If current element is different from the previous, it's unique
            if (!arr.get(i).equals(arr.get(j))) {
                j++;
                arr.set(j, arr.get(i));
            }
            
        }
        arr.subList(j+1, arr.size()).clear();
        return j+1;
    }
}