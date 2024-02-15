public class Solution {
    public int solution(int num) { 
        int answer = 0;
        long i = num;

        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else  {
                i = i*3 +1;
            }
            answer++;

            if (answer > 500) {
                return  -1; 
            }
        }
        return answer;
    }
}