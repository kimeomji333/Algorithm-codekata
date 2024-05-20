import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 중복 제거
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 중복이 제거된 폰켓몬의 종류 수
        int uniqueCount = set.size();

        // 선택할 수 있는 최대 수
        int maxSelectCount = nums.length / 2;

        // 최대한 다양한 종류 선택을 위해
        // 선택할 수 있는 폰켓몬의 수와 중복이 제거된 종류 수 중 작은 값 선택
        answer = Math.min(uniqueCount, maxSelectCount);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution.solution(nums));
    }
}