import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // Initialize an empty list to hold the final result
        List<Integer> resultList = new ArrayList<>();
        
        // Iterate through the intervals
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            
            // Copy the elements from arr[a] to arr[b] into the resultList
            for (int j = a; j <= b; j++) {
                resultList.add(arr[j]);
            }
        }
        
        // Convert the resultList to an int[] and return
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
