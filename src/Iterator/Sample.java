package Iterator;
import java.io.*;
import java.util.*;
public class Sample {
    public static void main(String args[])
    {
        ArrayList<String> cityNames = new ArrayList<String>();
        cityNames.add("Chennai");
        cityNames.add("Coimbatore");
        cityNames.add("Madurai");
        cityNames.add("Trichy");
        cityNames.add("Salem");
        Iterator iterator = cityNames.iterator();
        System.out.println("CityNames elements : ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
}
