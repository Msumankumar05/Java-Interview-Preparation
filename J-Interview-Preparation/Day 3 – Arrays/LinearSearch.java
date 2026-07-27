import java.util.Scanner;
public class LinearSearch {
    public static void Linear(int[] arr, int traget){

        for(int i = 0 ; i < arr.length ; i++){
            if(traget == arr[i]){
                System.out.println("The Search element is :" + arr[i] + " In " + i + " Index");
                return;
            }
        }
        System.out.println("The search element is not found");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eneter a arr size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter a  elements in array ");
        for( int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter a element to find in the array");
        int find = sc.nextInt();

        Linear(arr,find);
        sc.close();
    }
    
}
