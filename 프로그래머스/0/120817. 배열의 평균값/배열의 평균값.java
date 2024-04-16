class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0; //배열의 모든 값을 담을 변수
        
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i]; 
        }
        answer = (double)sum / numbers.length;
        
        return answer;
    }
}