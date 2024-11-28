class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer result = new StringBuffer();
        int len = my_string.length();
        
        // m개씩 잘라서 배열 만들고, 각 배열을 순회해서 배열[i][1] 을 출력해서 붙여서 문자열로 추출
                
        for(int i=0; i <len; i+=m) {
            String row = my_string.substring(i,Math.min(i+m,len));
            if(c-1 < row.length()){
                result.append(row.charAt(c-1));
            }
        }

        return result.toString();
    }
}