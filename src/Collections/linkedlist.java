package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Rinshid");
        al.add("Vijay");
        al.add("ajith");
        al.add("Abhinav");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

