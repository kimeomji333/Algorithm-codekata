import java.util.*;

class Solution {
    public long solution(long n) {
        // n을 arr 리스트에 저장
        String[] arr = Long.toString(n).split("");
        
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for (String i : arr) {
            sb.append(i);
        }
        
        return Long.parseLong(sb.toString());
    }
}