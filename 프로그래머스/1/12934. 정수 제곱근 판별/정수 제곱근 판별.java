public class Solution {
    public long solution(long n) {
         long x = (long) Math.sqrt(n);
        if (n == Math.pow(x,2)) {
            return (long) Math.pow(x+1,2);
        } else {
            return -1;
        }
    }

}