package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adwaith");
        names.add("babu");
        names.add("arnav");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Bob")) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + names);
    }
}

