class Solution {
    public String solution(String s) {        
        String answer = "";
        int bla = 0; // 공백이 나오면 초기화해줄 변수 지정
        String[] arr = s.split(""); // 문자열 단어들을 하나씩 나눠 배열에 담기

        // 조건문으로 짝수면 대문자, 홀수면 소문자로 바꿈.
        // 단, 문자열 전체가 아닌, 단어별로 홀/짝 인덱스 판단 -> 공백은 0으로 초기화
        // 첫번째 글자는 0번째 인덱스로 짝수로 보아 대문자로 출력.

        // 각 요소를 돌면서 공백이 있을 때는 0으로 초기화해야한다.
        for (String a1 : arr) {
            if (a1.equals(" ")) {
                bla = 0;
            } else {
                bla++;
            }
            
            if ( bla % 2 == 0 ) {
                answer += a1.toLowerCase();
            } else {
                answer += a1.toUpperCase();
            }
        }
        return answer;
    }
}