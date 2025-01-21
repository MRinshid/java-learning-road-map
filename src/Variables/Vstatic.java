package Variables;

class Vstatic {
    static int age;

    public static void main(String args[]) {
        Vstatic s1 = new Vstatic();
        Vstatic s2 = new Vstatic();
        s1.age = 24;
        s2.age = 21;
        Vstatic.age = 23;
        System.out.println("S1\'s age is: " + s1.age);
        System.out.println("S2\'s age is: " + s2.age);
    }
}




