public class ConstructorDemo {
    int id;
    String name;
    double salary;
    
    public ConstructorDemo(){
        this.id = 0;
        this.name = "suman";
        this.salary = 0.0;
    }

    public ConstructorDemo(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);
    }

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo();

        c1.display();


        ConstructorDemo c2 = new ConstructorDemo(005,"Makoju suman kumar",51000);
        c2.display();

        
    }
}
