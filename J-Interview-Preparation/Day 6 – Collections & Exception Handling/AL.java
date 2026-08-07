import java.util.ArrayList;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> A1 = new ArrayList<>();

        System.out.println("Enter a number of Students : ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            
            System.out.println("Enter " + (i+1) + "Student Name");
            String name = sc.nextLine();

            if (!A1.contains(name)) {
                A1.add(name);
            }

        }

        System.out.println(A1);

        sc.close();
    }
}
