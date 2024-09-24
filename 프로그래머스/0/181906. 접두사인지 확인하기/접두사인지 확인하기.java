import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < my_string.length(); i++) {
			str = my_string.substring(0, i+1);
			list.add(str);
		}
		
		for(int j = 0; j < list.size(); j++) {
			if(list.contains(is_prefix)) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
        return answer;
    }
}