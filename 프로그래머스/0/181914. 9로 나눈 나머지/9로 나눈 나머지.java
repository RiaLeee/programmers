class Solution {
    public int solution(String number) {
        int sum = 0;

        // number의 각 자릿수를 더함
        for (char ch : number.toCharArray()) {
            sum += ch - '0'; // char를 int로 변환하여 더함
        }

        // 합을 9로 나눈 나머지 반환
        return sum % 9;
    }
}
