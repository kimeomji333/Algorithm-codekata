class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 +1];
        
        // 반복문으로 주어진 범위에 해당하는 부분 배열 추출
        for(int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        
        return answer;
    }
}