package Serialization;
import java.io.*;

public class DeSerialization {
    public static void main(String args[]) {
        File file = new File("C:\\Users\\LENOVO\\Desktop\\AALUDRA\\Sample.txt");
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
           Student st=(Student) input.readObject();
            System.out.println(st.getId());
           System.out.println(st.getName());
           input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
