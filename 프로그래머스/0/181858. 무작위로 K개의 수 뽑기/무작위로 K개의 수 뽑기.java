import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        
        for(int a: arr){
            if(!result.contains(a) && result.size()<k){
                result.add(a);
            }
        }
        
        if(result.size() < k){
            while(result.size() < k){
                result.add(-1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}