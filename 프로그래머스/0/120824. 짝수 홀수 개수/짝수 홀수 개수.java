class Solution {
    public int[] solution(int[] num_list) {
        // 짝수 홀수 개수 저장할 배열 생성
        int[] answer = new int[2];
        
        // 짝수 홀수 가운터 변수 초기화
        int evenCount = 0;
        int oddCount = 0;
        
        // 반복문으로 각 원소의 짝수 홀수 개수 세기
        for(int num : num_list) {
            if(num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        answer[0] = evenCount;
        answer[1] = oddCount;
        return answer;
    }
}