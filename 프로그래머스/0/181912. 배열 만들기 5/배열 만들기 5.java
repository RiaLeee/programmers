import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            String str=intStrs[i].substring(s,s+l);
            if(Integer.parseInt(str)>k){
                 result.add(Integer.parseInt(str));
            }
        }
            
              
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}