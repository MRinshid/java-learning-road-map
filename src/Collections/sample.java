package Collections;

import java.util.ArrayList;
import java.util.*;

public class sample {
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Risnhid");
        list.add("Vijay");
        list.add("ajith");
        list.add("Abhinav");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

