package Variables;

public class instances {
    public String name;
    public int age=22;
    public  instances()
    {
        this.name="rinshid";
    }
    public static void main(String args[])
    {
        instances a=new instances();
        System.out.println("name:"+a.name);
        System.out.println("age is:"+a.age);
    }
}
