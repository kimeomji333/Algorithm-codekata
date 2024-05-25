class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 문자열을 분리합니다.
        String[] tokens = my_string.split(" ");
        
        // 초기값을 첫 번째 숫자로 설정합니다.
        int result = Integer.parseInt(tokens[0]);
        
        // 연산자를 기준으로 루프를 돌며 계산합니다.
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        
        return result;
    }
}