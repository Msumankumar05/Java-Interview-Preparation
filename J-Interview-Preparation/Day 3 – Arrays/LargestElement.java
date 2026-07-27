import java.util.Scanner;

public class LargestElement {

    public static int FindLargest(int[] num){

        
        int Largest = num[0];
        for (int j = 0; j < num.length; j++) {
            if (Largest < num[j]) {
                Largest = num[j];
            }
        }
        return Largest;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a arr size ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("enter a arr elements");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int Largest = FindLargest(arr);

        System.out.println("The Largest element is : " + Largest);

        sc.close();
    }
}
