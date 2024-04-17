class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // 반복문을 통해 문자열을 한 글자씩 확인하여 제거하고자 하는 문자가 아닌 경우 결과값 반환
        for (int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i, i + 1).equals(letter)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}