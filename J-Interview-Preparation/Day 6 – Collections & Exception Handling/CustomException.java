import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Saves the error message
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            // 2. Check the age
            if (age < 18) {
            throw new InvalidAgeException("Not allowed to vote!");
            } else {
                System.out.println("Eligible to vote.");
            }

        } catch (InvalidAgeException e) {
            // 3. Catch and print your error message if age is under 18
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
