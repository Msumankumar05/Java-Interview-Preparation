import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter a elements in array");
        for(int i = 0 ; i < a ; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println("stored elements");
        for( int j = a-1 ; j >= 0 ; j --){
            System.out.println(arr[j]);
        }


        sc.close();

    }
}
