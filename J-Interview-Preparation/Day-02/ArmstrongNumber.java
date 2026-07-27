import java.util.Scanner;

public class ArmstrongNumber {
    public static void checkArmstrong(int n) {
        
        int originalNumber = n; 

        int length = Integer.toString(n).length();
        int[] digits = new int[length];


        for (int i = 0; i < length; i++) {
            digits[i] = n % 10; 
            n /= 10;
        }

        int sum = 0;
        for (int j = 0; j < length; j++) {
            
            sum += (int) Math.pow(digits[j], length); 
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether it's an Armstrong number or not:");
        int num = sc.nextInt();

        checkArmstrong(num);

        sc.close();
    }
}
