import java.util.Scanner;

public class SmallestElement {
    public static int findSmallest(int[] num){

        
        int Smallest = num[0];
        for (int j = 0; j < num.length; j++) {
            if (Smallest > num[j]) {
                Smallest = num[j];
            }
        }
        return Smallest;
        
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

        int Smallest = findSmallest(arr);

        System.out.println("The Smallest element is : " + Smallest);

        sc.close();
    }
    
}
