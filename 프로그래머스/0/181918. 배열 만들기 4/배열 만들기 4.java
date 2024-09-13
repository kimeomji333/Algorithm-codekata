import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int i = 0;
        while(i < arr.length){
            
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }
            else{
                int last = stk.get(stk.size()-1);
                if(last < arr[i]){
                    //stk의 마지막 원소 < arr[i]
                    //arr[i]를 stk 뒤에 추가 하고 
                    stk.add(arr[i]);
                    i++;
                } else{
                    //stk의 마지막 원소 >= arr[i] 
                    //stk의 마지막 원소 제거
                    stk.remove(stk.size() - 1);
                }
            }
        }
        return stk;
    }
}