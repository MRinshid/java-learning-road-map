package CollectorClass;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;


public class CollectorClassExample {
    public static void main(String args[])
    {
        List<Integer> l=Arrays.asList(10,2,3,5,6);
        List<Integer> l1=Arrays.asList(12,10,13,1);
        Map<Integer,Integer> m=l1.stream()
                .filter(n->n>10)
                .collect(Collectors.toMap(n->n%10,n->n));
        m.entrySet().stream().forEach(n->System.out.println(n.getKey()+""+n.getValue()));

    }
}
