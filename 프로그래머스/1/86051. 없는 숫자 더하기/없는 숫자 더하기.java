class Solution {
    public int solution(int[] numbers) {
        int answer = 0+1+2+3+4+5+6+7+8+9;

        for (int n : numbers) {
            answer -= n;
        }
        return answer;
    }
}