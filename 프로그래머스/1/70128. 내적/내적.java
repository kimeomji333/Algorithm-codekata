class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 길이가 같은 배열이니, 배열의 길이만큼 정수값 지정
        int n = a.length;
        
        // 반복문을 이용해서 배열 순서 지정
        for (int i = 0; i < n; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}