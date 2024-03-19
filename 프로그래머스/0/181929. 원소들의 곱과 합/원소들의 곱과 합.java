class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for (int i=0; i<num_list.length; i++) {
            sum += num_list[i]; // 모든 원소들의 합
            mul *= num_list[i]; // 모든 원소들의 곱
            answer = mul < sum*sum ? 1 : 0;
        }
        return answer;
    }
}