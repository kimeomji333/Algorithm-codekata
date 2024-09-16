class Solution {
    public String solution(String my_string, int[][] queries) {
        //문자열을 문자 배열로 변환
        //반복문으로 처음과 끝 인댁스 가져오기
        //처음이 끝보다 작을 동안만 반복
        //임시변수로 두 문자의 위치 바꿈
        
        char[] arr = my_string.toCharArray();
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            while(s < e){
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return new String(arr);
    }
}