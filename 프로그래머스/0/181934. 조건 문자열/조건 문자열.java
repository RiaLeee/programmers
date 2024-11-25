class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean result= false;
        
        // 나올수있는기호: >=,<=,>,<
        if(ineq.equals(">") && eq.equals("=")){
            result=(n>=m);
        }
        else if(ineq.equals("<") && eq.equals("=")){
            result=(n<=m);
        }
        else if(ineq.equals(">") && eq.equals("!")){
            result=(n>m);
        }
        else {result=(n<m);}

        return result?1:0;
    }
}