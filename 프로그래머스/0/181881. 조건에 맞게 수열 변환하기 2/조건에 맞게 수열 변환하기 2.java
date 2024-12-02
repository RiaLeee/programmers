import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int count=0;
        while(true){
            int[] preArr = new int[arr.length];

            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0 && arr[i]>=50){
                    preArr[i] = arr[i]/2;
                }
                else if(arr[i]%2!=0 && arr[i]<50){
                    preArr[i] = arr[i]*2+1;
                }
                else {preArr[i] = arr[i];}
            }
            
            if(Arrays.equals(arr,preArr)){
                return count;   
            }
            arr = preArr;
            count++;   

        }
    }
}