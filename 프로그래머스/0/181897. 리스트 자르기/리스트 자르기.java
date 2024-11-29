class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] result;
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n){
            case 1:
                result = new int[b + 1]; // 0번부터 b번까지
                for(int i = 0; i <= b; i++){
                    result[i] = num_list[i];
                }               
                break;
            case 2:
                result = new int[num_list.length - a]; // a번 인덱스부터 끝까지
                for(int i = 0; i < num_list.length - a; i++){
                    result[i] = num_list[a + i];
                } 
                break;
            case 3:
                result = new int[b - a + 1]; // a번 인덱스부터 b번 인덱스까지
                for(int i = 0; i <= b - a; i++){
                    result[i] = num_list[a + i];
                }
                break;
            default:
                // c 간격으로 슬라이싱
                int len = (b - a) / c + 1; // (b - a)간격으로 나누어 줄 수 있는 수
                result = new int[len];
                for(int i = 0, index = a; index <= b; i++, index += c){
                    result[i] = num_list[index];
                }
                break;
        }
        return result;
    }
}
