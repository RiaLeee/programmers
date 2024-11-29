import java.util.*;
import java.io.*;

class Solution {
    public ArrayDeque<Integer> solution(int[] arr, int[] query) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();

        for(int a: arr) {
            answer.add(a);
        }

        for(int i=0; i<query.length; i++) {
            int len = answer.size();
            if(i%2 == 0) {
                for(int j=query[i]+1; j<len; j++) {
                    answer.removeLast();
                }
            }
            else {
                for(int j=0; j<query[i]; j++) {
                    answer.remove();
                }
            }
        }

        return answer;
    }
}