class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            // 제곱수인 경우 홀수, 아니면 짝수 이용
            if (i % Math.sqrt(i) == 0) {
                answer -= i; // 홀수는 빼기
            } else {
                answer += i;
            }
        }
        return answer;
    }
}