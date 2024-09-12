import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = Integer.toString(i);
            boolean flag = true;
            
            for(char c : str.toCharArray()){
                if(c != '0' && c != '5'){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                answer.add(i);
                Collections.sort(answer);
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }   
}