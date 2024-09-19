class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        //순회하면서 문자열을 하나씩 가져와
        // 그 안에서 이차원 배열 속에서 자르기
        for(int i = 0; i < my_strings.length; i++){
            String str = my_strings[i];
            
            answer += str.substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
    }
}