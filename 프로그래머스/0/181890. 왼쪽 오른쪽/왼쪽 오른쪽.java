import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        
        String[] result = {};
        
        for(int i=0; i < str_list.length; i++){
            String s = str_list[i];
            
            if(s.equals("l")){
                result = Arrays.copyOfRange(str_list,0,i);
                break;
            }
            else if(s.equals("r")){
                result = Arrays.copyOfRange(str_list,i+1,str_list.length);
                break;
            }
        }
        
        return result;
    }
}