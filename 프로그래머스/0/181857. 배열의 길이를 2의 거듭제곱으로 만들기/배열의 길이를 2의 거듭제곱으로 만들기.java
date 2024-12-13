class Solution {
    public int[] solution(int[] arr) {
        
        int newSize = 1;
        while(newSize < arr.length){
            newSize *= 2;
        }
        
        int[] result = new int[newSize];
        
        for(int i=0; i<arr.length; i++){
            result[i]=arr[i];
        }
        
        return result;
    }
}