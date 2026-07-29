import java.util.Scanner;

public class CountVowels {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countVowels(String text) {
        int left = 0;
        int right = text.length() - 1;
        int count = 0;

        while (left <= right) {

            if (left == right) {
                if (isVowel(text.charAt(left))) {
                    count++;
                }
            } else {
                if (isVowel(text.charAt(left))) {
                    count++;
                }
                if (isVowel(text.charAt(right))) {
                    count++;
                }
            }

            left++;
            right--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Total number of vowels: " + countVowels(str));
        sc.close();
    }
}