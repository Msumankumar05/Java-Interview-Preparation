public class Student {
    String name;
    int age;
    String cource;

    void display(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+age);
        System.out.println("Cource :"+cource);
    }

    public static void main(String[] args) {
        Student s1  = new Student();

        s1.name = "Makoju suman kumar";
        s1.age = 21;
        s1.cource = "MCA";

        s1.display();
    }
}
