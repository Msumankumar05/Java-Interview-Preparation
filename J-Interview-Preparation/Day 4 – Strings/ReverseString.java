import java.util.Scanner;

public class ReverseString {

    public static String ReverseS(String name){
        char[] str = name.toCharArray();

        int left = 0;
        int right = str.length-1;

        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left ++;
            right--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you name");
        String str = sc.nextLine();

        
        System.out.print("After ReverseString   "+ ReverseS(str));
        
        sc.close();
    }
}