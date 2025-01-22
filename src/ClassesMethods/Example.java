package ClassesMethods;

public class Example {
    public static int vol(int len,int breadth,int height)
    {
        int s;
        s=len*breadth*height;
        return s;
    }
    public static void main(String args[])
    {
        System.out.println("hello");
        int box= vol(10,4,6);
        System.out.println(box);


    }
}
