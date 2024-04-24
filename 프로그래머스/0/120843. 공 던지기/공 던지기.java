class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0; // numbers 값을 가져올 변수 
        
        // k번째 공을 던진 사람을 구하기 위한 반복문. 건너뛰기 위해 2ㅇ를 더해줌
        for(int i = 1; i < k; i++) {
            index += 2;
        }
        
        // index값이 배열의 길이보다 커질 수 있기 때문에 나눠줌
        index %= numbers.length;
        answer = numbers[index];
        
        return answer;
    }
}