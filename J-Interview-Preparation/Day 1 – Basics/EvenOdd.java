import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("enter a number  to find teh even or not");
        int num = sd.nextInt();

        if(num%2==0){
            System.out.println("even number ");
        }
        else{
            System.out.println("not even");
        }
        sd.close();
    }
}