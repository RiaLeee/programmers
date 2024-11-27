class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d}; // 나온 값들 묶는 배열
        int[] counts = new int[7]; // 빈도수 배열 (모두 같을 때 4)
        
        for(int num : dice){
            counts[num]++;
        }
        
        for(int i=1; i<=6; i++) {
            if(counts[i] == 4) {
              return 1111 * i;  
            }
        }
        
        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                if(counts[i]==3 && counts[j]==1) {
                    return  (10*i+j)*(10*i+j);
                }
                else if(counts[i]==2 && counts[j]==2 && i!=j) {
                    return  (i + j)*Math.abs(i-j);
                }              
            }
        }
        
        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                for(int r=1; r<=6; r++) {
                    if(counts[i]==2 && counts[j]==1 && counts[r]==1 && j!=r){
                        return j*r;
                    }
                }
            }
        }
        
        int minValue=Integer.MAX_VALUE;
        for(int i=1; i<=6; i++) {
            if(counts[i] == 1) {
                minValue=Math.min(minValue,i);
            }
        }
        return minValue;  
    }
}