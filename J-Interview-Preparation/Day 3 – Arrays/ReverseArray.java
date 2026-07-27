import java.util.Scanner;
public class ReverseArray {

    public static void Reverse(int[] arr){
        for( int i = arr.length-1 ; i >= 0; i--){
            System.out.println("the Reverse elements :"+ arr[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements in array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr);
        sc.close();
    }
}
