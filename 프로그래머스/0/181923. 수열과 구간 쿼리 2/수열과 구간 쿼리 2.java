class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
       
        for(int i=0; i < queries.length; i++){
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            // 가장 작은 값 찾기
            int min = Integer.MAX_VALUE;
            
            // 범위 내에서 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i] 찾기
            for(int j=s; j<=e ; j++){
                if(arr[j]>k) {
                    min=Math.min(min,arr[j]);
                }
            }
            
            // 조건에 맞는 값이 없으면 -1, 그렇지 않으면 가장 작은 값 저장
            if(min==Integer.MAX_VALUE){
                answer[i]=-1;
            }
            else answer[i]=min;                     
        }
        return answer;
        
        
    }
}