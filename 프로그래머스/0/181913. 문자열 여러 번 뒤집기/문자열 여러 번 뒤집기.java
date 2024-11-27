class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        
        for(int[] query : queries){
            int s =query[0]; 
            int e =query[1];
            
            StringBuffer sub = new StringBuffer(sb.substring(s,e+1));           
            String reversed = sub.reverse().toString();
            
            sb.replace(s,e+1,reversed);            
        }
        
        return sb.toString();
    }
}
    
    