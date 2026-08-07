class students{
    void display(String name){
        System.out.println("Name :"+name);
    }
    void display(String name,int age){
        System.out.println("Name :"+name+" Age :"+age);
    }
    void display(String name, int age, String cource){
        System.out.println("Name is : " + name + " Age is : "+age+ "Cource is :"+cource);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        students s1 = new students();

        
        s1.display("suman");
        s1.display("suman",21);
        s1.display("suman", 21,"MCA");
    }
    
}
