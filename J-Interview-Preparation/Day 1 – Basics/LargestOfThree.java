import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is largest number\t"+a);
        }
        else if( b>a && b>c){
            System.out.println("b is the largest number\t"+ b);
        }
        else{
            System.out.println("c is the largest number\t"+ c);
        }
        sc.close();
    }
}