class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr 자리 기준
        // query가 [i,j] 자리 이고, query[i]값 = arr 배열 중 값과 같으면, arr에서 자리 체인지 
        
        for(int[] query : queries) { // [0, 3],[1, 2],[1, 4]
            int i = query[0]; //0
            int j = query[1]; //3
            
            int temp = arr[i]; //0
            arr[i] = arr[j];
            arr[j] = temp;
           
        }
        return arr;
    }
}