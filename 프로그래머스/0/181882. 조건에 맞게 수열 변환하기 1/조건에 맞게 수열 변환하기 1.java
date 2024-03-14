class Solution {
    public int[] solution(int[] arr) {
        // answer 배열을 생성, 길이는 arr 배열의 길이와 동일
        int[] answer = new int[arr.length];
        
        // 반복문으로 arr 배열의 각 원소에 대해
        for (int i=0; i<arr.length; i++) {
            
            // 조건문으로 50미만이고, 홀수인 경우와 50보다 크거나 같고, 짝수인 경우, 그 외에는 그대로 answer 배열로 반환
            if(arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else {
               answer[i] = arr[i]; 
            }
        }
        return answer;
    }
}