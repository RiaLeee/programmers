class Solution {
    public int solution(int[] num_list) {
        // 배열을 순차적으로 탐색
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) { // 음수 발견 시
                return i; // 해당 인덱스 반환
            }
        }
        // 음수가 없다면 -1 반환
        return -1;
    }
}
