class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);

        if (n == Math.pow(x, 2)) {
            answer = (long) Math.pow((x+1),2);
        } else {
            answer = -1;
        }
        return answer;
    }
}