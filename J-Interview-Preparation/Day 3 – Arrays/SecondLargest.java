import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static int SecondL(int[] arr) {

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int x = arr.length - 2; x >= 0; x--) {
            if (largest != arr[x]) {
                return arr[x];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("enter a array elements");
        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }

        System.out.println("The second Largest Element in Array : " + SecondL(arr));
        sc.close();
    }
}