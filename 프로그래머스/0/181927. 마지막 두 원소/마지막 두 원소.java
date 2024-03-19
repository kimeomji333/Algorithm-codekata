class Solution {
    public int[] solution(int[] num_list) {
        // (마지막 원소가 들어갈) answer 배열 생성
        int[] answer = new int[num_list.length + 1];
        
        // 마지막 원소 변수 생성
        int last = 0;
        
        // 반복문으로 배열에 하나씩 담아 조건식에 따라 마지막 원소 값을 넣는다.
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
            if (num_list[num_list.length -1] > num_list[num_list.length -2]) {
                answer[num_list.length] = num_list[num_list.length -1] - num_list[num_list.length -2];
            } else {
                answer[num_list.length] = num_list[num_list.length -1] * 2;
            }
        }
        return answer;
    }
}