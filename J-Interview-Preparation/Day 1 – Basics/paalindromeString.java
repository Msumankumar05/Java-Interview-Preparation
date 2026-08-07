import java.util.Scanner;
public class paalindromeString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check wheather it's palindrome or not");
        String name = sc.nextLine();

        int left = 0;
        int right = name.length()-1;

        boolean isstr = true;

        while (left<right) {
            if(name.charAt(left)!=name.charAt(right)){
                isstr = false;
                break;
            }

            left++;
            right--;
        }

        if(isstr){
            System.out.println("it's a palindrom str");
        }
        else{
            System.out.println("not a palindrom number");
        }
        sc.close();
    }
}