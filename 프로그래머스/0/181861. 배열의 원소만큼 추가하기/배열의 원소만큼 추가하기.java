import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            for(int k=1; k<=arr[i]; k++){
                result.add(arr[i]);
            }
        }            
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}