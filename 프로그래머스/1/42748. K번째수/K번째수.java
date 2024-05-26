import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            // 배열의 i번째부터 j번째까지 자르기
            int[] sliceArray = Arrays.copyOfRange(array, start - 1, end);
            
            // 잘린 배열 정렬하기
            Arrays.sort(sliceArray);
            
            // 정렬된 배열에서 k번째 수 찾기
            answer[i] = sliceArray[k -1];
        }
        return answer;
    }
}