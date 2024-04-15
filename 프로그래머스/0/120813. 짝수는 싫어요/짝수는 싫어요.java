class Solution {
    public int[] solution(int n) {
        
        // n까지의 홀수 개수를 구한다
        int count = (n + 1) / 2;
        int[] answer = new int[count];
        
        // 홀수를 오름차순으로 배열에 담는다
        for(int i=0; i<count; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
    }
}