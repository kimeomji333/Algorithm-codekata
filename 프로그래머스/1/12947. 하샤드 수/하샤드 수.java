class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        
        while (n >= 1) {
            sum += n % 10;
            n /= 10;
        }
        if ( x % sum == 0) {
            return true;
        } else {
            return false;
        }

    }
}