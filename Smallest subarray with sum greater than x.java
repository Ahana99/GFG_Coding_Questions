

// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;  // Initially, set to the largest possible value
        int sum = 0;  // Sum of elements in the current window
        int start = 0;  // Left pointer of the sliding window
        
        // Iterate with the 'end' pointer to extend the window
        for (int end = 0; end < n; end++) {
            // Add the current element to the sum
            sum += arr[end];
            
            // Shrink the window from the left while the sum is greater than x
            while (sum > x) {
                // Update the minimum length of the subarray
                minLength = Math.min(minLength, end - start + 1);
                
                // Remove arr[start] from the sum and move 'start' to the right
                sum -= arr[start];
                start++;
            }
        }
        
        // If no subarray is found, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

}
