class Solution {
    public int solution(String binomial) {

        String[] bin = binomial.split(" ");
        int a = Integer.parseInt(bin[0]);
        int b = Integer.parseInt(bin[2]);
        String op = bin[1];
        
        switch(op){
            case "+": return a+b;
            case "-": return a-b;
            default: return a*b;
        }
    }
}