class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 정수 배열 생성
        int[] answer = new int[2];
        
        // 두 분수를 더한다.
        int numer = numer1 * denom2 + numer2 * denom1; 
        int denom = denom1 * denom2;
        
        // 합의 분자와 분모의 최대공약수를 구한다.
        int max = 1;
        for (int i=1; i<=numer && i<=denom; i++) {
            if(numer%i == 0 & denom%i == 0) {
                max = i;
            }
        }
        
        // 최대공약수로 분자와 분모를 나눈다.
        answer[0] = numer/max;
        answer[1] = denom/max;
                    
        return answer;
    }
}