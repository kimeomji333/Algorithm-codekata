class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxA = 0, minA= 0;

        for (int i = 0; i < sizes.length; i++) {
            int min = Math.min(sizes[i][0], sizes[i][1]);
            int max = Math.max(sizes[i][0], sizes[i][1]);
            
            maxA = Math.max(max, maxA);
            minA = Math.max(min, minA);
        }
        answer = maxA * minA;

        return answer;
    }
}