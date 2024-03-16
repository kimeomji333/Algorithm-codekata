class Solution {
    public int solution(int a, int b) {

        String str = Integer.toString(a) + Integer.toString(b);
        int ab = Integer.valueOf(str);
        
        if (ab >= 2*a*b) {
        	return ab;
        } else {
        	return 2*a*b;
        }
    }
}