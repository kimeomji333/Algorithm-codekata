class Solution {
    public String solution(String my_string) {
        String answer ="";
        char[] chars = my_string.toCharArray();
        char[] reverse = new char[chars.length];
        
        for(int i = 0; i < chars.length; i++) {
            reverse[i] = chars[chars.length -i -1];
        }
        
        answer = new String(reverse);
        return answer;
    }
}