import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // 배열이 비어있는 경우, if문을 통해서 -1 값을 리턴해주기
        if (arr.length == 1) {
            answer = new int[]{-1};
        }  else {
            ArrayList<Integer> intList = new ArrayList<>();
            // arr 배열의 모든 요소를 a에 저장
            for (int a : arr) {
                intList.add(a);
            }
            //intList 의 가장 작은 수 제거
            //리스트에서 최소값 구하려면 Collections.min(list) 메서드 사용
            intList.remove(Collections.min(intList));
            answer = new int[arr.length -1];
            
            // 어레이리스트를 배열에 다시 저장
            for (int i=0; i < intList.size(); i++) {
                answer[i] = intList.get(i);
            }
        }
        return answer;
    }
}