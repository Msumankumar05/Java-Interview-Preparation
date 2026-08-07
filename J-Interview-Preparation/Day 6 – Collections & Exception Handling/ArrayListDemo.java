import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();

        l1.add("suman");
        l1.add("kumaar");
        l1.add("subuuuu");

        System.out.println(l1);

        l1.remove("kumaar");

        System.out.println(l1);

        System.out.println(l1.contains("suman"));

        System.out.println(l1.size());

        for ( String names : l1){
            System.out.println(names);
        }
        
    }
}