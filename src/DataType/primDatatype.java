package DataType;
import java.util.*;

public class primDatatype {
    public static void main(String args[]) {
        int a = 10, b = 20, c, i;
        c = a + b;
        System.out.println("Addition of two number is:" + c);
        System.out.println("enter the name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("username is:" + name);
        int d[] = {10, 20, 30, 40, 50};
        for (i = 0; i<d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
