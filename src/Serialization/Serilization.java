package Serialization;
import java.io.*;

public class Serilization {
    public static void main(String args[]) throws IOException
    {
        Student st=new Student();
        st.setId(101);
        st.setName("rinshid");
        File file=new File("C:\\Users\\LENOVO\\Desktop\\AALUDRA\\Sample.txt");
        if(!file.exists())
        {
            if(file.createNewFile())
            {
                ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream(file));
                output.writeObject(st);
                output.close();
                System.out.println("Successfully file created ");
            }

        }
    }
}
