class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 
        for (int i=0; i<=n; i++) {
            if(n%2 != 0 && i%2 !=0) {
                answer += i;
            }
            else if (n%2 == 0 && i%2 ==0) {
                answer += i*i;
            }
        }
    
        return answer;
    }
}