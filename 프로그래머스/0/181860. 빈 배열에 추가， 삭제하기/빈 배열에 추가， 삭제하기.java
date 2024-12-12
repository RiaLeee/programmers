import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> X = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]){ // true 면
                // X의 뒤에 arr[i]를 arr[i] × 2 번 추가
                for(int k=0; k<arr[i]*2; k++){
                    X.add(arr[i]);
                }               
            }
            else {
               // X에서 마지막 arr[i]개의 원소를 제거
                for(int k=0; k<arr[i]; k++){
                    if(!X.isEmpty()){
                        X.remove(X.size()-1);
                    }
                }  
            }
        }      
        return X.stream().mapToInt(Integer::intValue).toArray();
    }
}