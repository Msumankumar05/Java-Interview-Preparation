import java.util.Scanner;;
public class Factorial {

    public static int fact(int n){
        int result = 1;
        for(int i = 1; i<=n ; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it's factorial or not");

        int n = sc.nextInt();
        System.out.println("the factorial is:\t" + fact(n));
        sc.close();
    }
}