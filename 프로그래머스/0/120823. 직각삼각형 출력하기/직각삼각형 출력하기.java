import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 높이가 n인 삼각형을 그리기 위한 반복문
        for(int i = 1; i <= n; i++) {
            // 해당 줄의 '*'개수 만큼 출력하기 위한 반복문
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
        System.out.println();
    }
}