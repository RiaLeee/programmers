class Solution {
    public int solution(int[] num_list) {
        
        // 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합
        // 10 이하이면 모든 원소의 곱
        int answer;
        if (num_list.length >=11){
            answer = 0;
            for(int num : num_list){
                answer += num;
            }
        
        }
        else {
            answer = 1;
            for(int num : num_list){
                answer *= num;
            }           
        }
        return answer;
    }
}