import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        
        // 문자열 기준으로 그룹화
        HashMap<Integer,Integer> lengthGroups = new HashMap<>();
        
        for(String str : strArr){
            int length = str.length();
            
            if(lengthGroups.containsKey(length)){
                lengthGroups.put(length,lengthGroups.get(length)+1);
            }
            else{
               lengthGroups.put(length,1); 
            }
        }
        
        // 맵 값으로 빼서 최댓값 찾기
        int maxNum =0;
        for(int num : lengthGroups.values()){
            if(num > maxNum){
                maxNum = num;
            }
            
        }
        return maxNum;
    }
}