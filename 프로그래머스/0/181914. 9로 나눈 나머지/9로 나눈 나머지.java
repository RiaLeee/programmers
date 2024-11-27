class Solution {
    public int solution(String number) {
        
        char[] ch = number.toCharArray();
        int sum=0;
        
        for(char c: ch) {
            sum += c - '0';
        }
      
        return sum%9;
    }
}