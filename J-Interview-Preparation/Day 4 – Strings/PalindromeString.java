import java.util.Scanner;

/**
 * PalindromeString
 */
public class PalindromeString {

    public static boolean PalinS(String name) {

        char[] str = name.toCharArray();
        int left = 0;
        int right = str.length - 1;
        boolean isPalin = true;
        while (left < right) {
            if (str[left] != str[right]) {
                isPalin = false;
                break;
            }
            left++;
            right--;

        }
        return isPalin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Palindrom string");
        String str = sc.nextLine();

        System.out.println("The Palindrom String is :" + PalinS(str));
        sc.close();
    }

}