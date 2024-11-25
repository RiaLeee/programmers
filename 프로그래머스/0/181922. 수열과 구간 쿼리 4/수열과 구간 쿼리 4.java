class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i < queries.length; i++){
            int[] query = queries[i];
            int s = query[0];//0
            int e = query[1];//4
            int k = query[2];//1
            
            for(int j=s; j <=e; j++){ //0 <=j <=4
                if(j%k==0) { //1%4
                    arr[j]+=1;
                }
            }
            
            
        }
    
        return arr;
    }
}