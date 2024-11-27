class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string); // StringBuilder로 변환하여 수정 가능하도록 함
        
        // queries에 있는 각 쿼리 처리
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            // s부터 e까지의 부분 문자열을 뒤집기
            String sub = sb.substring(s, e + 1); // s부터 e까지의 부분 문자열 추출
            sb.replace(s, e + 1, new StringBuilder(sub).reverse().toString()); // 해당 부분을 뒤집어서 대체
        }
        
        return sb.toString(); // 수정된 문자열 반환
    }
}
