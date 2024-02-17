class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); 
        // 문자열 s의 길이만큼 <역순으로 담을 배열> 선언.
        int[] answer = new int[str.length()];

        // 반복문 for문을 돌면서 각 자릿수를 구하는 식을 이용해서,
        // 나오는 숫자를 순서대로 넣어주면 역순으로 넣어지게 된다.

        for (int i = 0; i < str.length(); i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}