class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length]; 
        
        // 반복문으로 배열의 원소를 거꾸로 복사
        for(int i = 0; i < length; i++) {
            answer[i] = num_list[length - 1 - i];
        }
        
        return answer;
    }
}