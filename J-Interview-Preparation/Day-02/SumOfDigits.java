import java.util.Scanner;

public class SumOfDigits {
    public static int SOD(int n){
        int digits,sum = 0;
        
        while (n>0) {
            digits = n % 10;
            sum += digits;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to get sum of digits");
        int num = sc.nextInt();

        int result = SOD(num);
        System.out.println("The sum of digit is:" + result);
        sc.close();
    }
}
