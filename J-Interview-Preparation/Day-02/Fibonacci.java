import java.util.Scanner;

public class Fibonacci {

    public static void fibo(int n) {
        int F = 0;
        int S = 1;
        int R = 1;

        System.out.println("Fibo sequence");
        for (int i = 0; i < n; i++) {
            System.out.print(F + "\t");
            R = F + S;
            F = S;
            S = R;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check fibo or not");
        int n = sc.nextInt();
        fibo(n);
        sc.close();

    }
}
