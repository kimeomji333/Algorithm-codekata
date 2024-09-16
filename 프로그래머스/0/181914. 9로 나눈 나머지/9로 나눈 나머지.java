class Solution {
    public long solution(String number) {
        int answer = 0;
        
        //문자열로 잘라서
        //반복문을 돌며 누적합
        //합을 9로 나눈 나머지
        String[] splitNum = number.split("");
        
        for(String s : splitNum){
            answer += Integer.parseInt(s);
        }
        return answer % 9;
    }
}