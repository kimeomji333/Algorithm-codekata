class Solution {
    public int[] solution(int[] numbers) {
        
        // 주어진 배열의 길이만큼 새로운 배열 생성
        int[] answer = new int[numbers.length];
        
        // 각 원소에 대해 두 배를 한 값을 새로운 배열에 저장
        for(int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}