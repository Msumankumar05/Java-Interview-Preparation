class car{
    void start(){
        System.out.println("car start");
    }
}
class bike extends car{
    @Override
    void start(){
        System.out.println("bike start");
    }
}

public class MethodOverriding {
    public static void main(String [] args){
        car c1 = new car();
        car b1 = new bike();
        b1.start();
        c1.start();
    }
}