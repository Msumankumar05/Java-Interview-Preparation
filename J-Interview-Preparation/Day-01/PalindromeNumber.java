import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre a number to check it's palindrome or not");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;

        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }

        if(temp == rev){
            System.out.println("thes number is plaindrome number");

        }

        else{
            System.out.println("not a plaindrome number");
        }
        sc.close();
    }
}
