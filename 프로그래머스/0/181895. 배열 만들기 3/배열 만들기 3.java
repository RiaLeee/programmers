import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        
        for(int[] interval : intervals){
            int f= interval[0];
            int s= interval[1];
            
            for(int i=f; i<=s; i++){
                result.add(arr[i]);
            }            
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}