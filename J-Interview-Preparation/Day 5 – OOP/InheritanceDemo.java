class animal {
    void eat() {
        System.out.println("animal are eat");
    }
}

class dog extends animal {
    void brek() {
        System.out.println("Dogs are brek");
    }
}

class meu extends dog{
    void meuo(){
        System.out.println("cats are meu");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        meu m1 = new meu();

        m1.eat();
        m1.brek();
        m1.meuo();
    }
}
