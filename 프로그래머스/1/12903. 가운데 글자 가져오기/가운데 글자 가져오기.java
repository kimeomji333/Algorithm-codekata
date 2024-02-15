class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length();

        // 단어의 길이가 짝수라면, 나머지가 0이 되는 조건식을 이용해서,
        // 문자의 개수, 즉 num이 숫자니깐, 하나의 문자화 하려면 chatAt 이용
        if (s.length() % 2 == 0) {
            answer = s.substring((num/2)-1, (num/2)+1);
        } else {
            answer = s.substring((num/2), (num/2)+1);
        }
        return answer;
    }
}