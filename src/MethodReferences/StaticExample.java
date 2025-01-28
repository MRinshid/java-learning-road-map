package MethodReferences;
interface IAdd{
    void add(int a,int b);
    }
public class StaticExample {
    public static void sum(int val1, int val2) {
        System.out.println(val1 + val2);
    }

    public static void main(String args[]) {
        IAdd iAdd = StaticExample::sum;
        iAdd.add(1, 2);
    }
}
