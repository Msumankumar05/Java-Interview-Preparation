import java.util.Scanner;
public class palin {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a size of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        boolean isarrpalin = true;

        System.out.println("enter arr elements");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            if(arr[left]!=arr[right]){
                isarrpalin = false;
                break;
                
            }
            left ++;
            right --;
        }

        if(isarrpalin){
            System.out.println("the arr is palindrom number");
        }
        else{
            System.out.println("the arr is not a palindrom number");
        }
        sc.close();
    }
    
}