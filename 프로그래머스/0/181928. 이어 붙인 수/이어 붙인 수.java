class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // 숫자를 붙일 변수
        String even = "";
        String odd = "";
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]); // 문자열로 된 이어붙인 짝수
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd); // 정수형으로 변경 후 더하기
        return answer;
    }
}