import java.util.Scanner;
import java.util.HashSet;

public class HS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> M1 = new HashSet<>();

        System.out.print("Enter number many numbers you want to add : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter " + (i+1) + " Number : ");
            int num = sc.nextInt();
            
            M1.add(num);
        }

        System.out.println(M1);

        sc.close();
    }
}
