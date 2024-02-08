import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        do {
            a= sc.nextDouble();
            b= sc.nextDouble();
        } while ((a <= 0 || b <= 0));
        System.out.println(a/b);
    }
}