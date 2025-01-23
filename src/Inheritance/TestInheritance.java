package Inheritance;
class RIN {
    void eat() {
        System.out.println("eating");
    }
}

class shi extends RIN {
    void bark() {
        System.out.println("barking");
    }
}
class ee extends shi{
    void weep()
    {
        System.out.println("weeping");
    }
}

public class TestInheritance {
    public static void main(String args[])
    {
        ee s=new ee();
        s.weep();
        s.eat();
        s.bark();


    }
}
