import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                intList.add(arr[i]);
            }
        }
        if (intList.isEmpty()) {
            intList.add(-1);
        }
        
        answer = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}