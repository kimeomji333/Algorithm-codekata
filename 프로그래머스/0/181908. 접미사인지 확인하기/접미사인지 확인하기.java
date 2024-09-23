import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        
        for(int i = 0; i < my_string.length(); i++){
            str = my_string.substring(i);
            list.add(str);
        }
        for(int j = 0; j < list.size(); j++){
            if(list.contains(is_suffix)){
                answer = 1;
            } else{
                answer = 0;
            }
        }
        return answer;
    }
}