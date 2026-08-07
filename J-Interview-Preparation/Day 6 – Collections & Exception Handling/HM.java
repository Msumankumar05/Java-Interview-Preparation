import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> H1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of Students : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter" + (i + 1) + " RollNo : ");
            int Rollno = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student" + (i + 1) + "Name :");
            String Name = sc.nextLine();

            if (!H1.containsKey(Rollno)) {
                H1.put(Rollno, Name);
            }
        }

        for (Map.Entry<Integer, String> entry : H1.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " | Name: " + entry.getValue());
        }

        sc.close();
    }
}
