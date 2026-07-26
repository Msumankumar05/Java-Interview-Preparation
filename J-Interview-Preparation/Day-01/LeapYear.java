import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find leapyear");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("thes year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        
        sc.close();

    }
}
