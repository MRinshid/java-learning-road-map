package Collections;
import java.util.*;
public class vector {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Rinshid");
        v.add("Vijay");
        v.add("Ajith");
        v.add("Abhinav");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
}
}
