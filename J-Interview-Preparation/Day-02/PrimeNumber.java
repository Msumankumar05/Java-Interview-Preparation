import java.util.Scanner;

public class PrimeNumber {

    public static boolean Prime(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it's a Prime or not");
        int num = sc.nextInt();
        if (Prime(num)) {
            System.out.println("The " + num + "" + "is Prime");
        } else {
            System.out.println("The" + num +  ""  + "is Not Prime");
        }
        sc.close();

    }
}
