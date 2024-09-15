import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        //Arrays.sort(dice);
        //배열에 넣어 조건문으로 나눠서 크기 비교와 연산결과
        //정렬?
        int[] dice = {a,b,c,d};
        Arrays.sort(dice);
        
        // 모두 같은 경우
        if(dice[0] == dice[3]){
            answer = 1111 * dice[0];
        } 
        // 세개 같은 경우 012 123
        else if (dice[0] == dice[2]){
            answer = (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]);
        } 
        else if(dice[1] == dice[3]){
            answer = (10 * dice[1] + dice[0]) * (10 * dice[1] + dice[0]);
        }
        // 두개씩 같은 경우
        else if (dice[0] == dice[1] && dice[2] == dice[3]){
            answer = (dice[0] + dice[3]) * Math.abs(dice[0] - dice[3]);
        } 
        // 두개 같고, 나머지 두개가 각각 다른 경우
        else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]){
            if(dice[0] == dice[1]){
                answer = dice[2] * dice[3];
            }
            if(dice[1] == dice[2]){
                answer = dice[0] * dice[3];
            }
            if(dice[2] == dice[3]){
                answer = dice[0] * dice[1];
            }
        } 
        // 네개 모두 다른 경우
        else{
            for(int i : dice){
                min = Math.min(min, i);
            }
            answer = min;
        }
        return answer;
    }
}