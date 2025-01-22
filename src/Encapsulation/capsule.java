package Encapsulation;
class human{
    private int age=11;
   private String name="rinshid";
   public int getAge()
   {
       return  age;
   }
   public String getName()
   {
       return name;
   }
}

public class capsule {
    public static void main(String args[])
    {
        human sc=new human();
        System.out.println(sc.getName()+":"+sc.getAge());
    }
}
