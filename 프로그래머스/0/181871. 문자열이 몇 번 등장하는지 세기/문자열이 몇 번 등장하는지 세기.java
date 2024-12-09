class Solution {
    public int solution(String myString, String pat) {
        int index = 0; // indexOf에 사용할 인덱스 표시
        int count = 0; // 빈도수 리턴 값 저장
        
        while((index=myString.indexOf(pat,index)) != -1){
            count++;
            index += 1;
        }
        
        return count;
    }
}