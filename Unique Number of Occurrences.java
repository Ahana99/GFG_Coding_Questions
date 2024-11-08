


class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
         HashMap<Integer, Integer> occurrences = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Check if all occurrence counts are unique
        HashSet<Integer> uniqueCounts = new HashSet<>(occurrences.values());
        
        // If the size of uniqueCounts is the same as the number of entries in occurrences,
        // it means all occurrence counts are unique.
        return uniqueCounts.size() == occurrences.size();
    }
}
        