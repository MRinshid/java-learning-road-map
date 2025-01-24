package thread;
class A extends  Thread{
    public void run(){
        for(int i=0;i<=10;i++){
        System.out.println("hi im mohammed  rinshid a");}
    }
}
class B extends Thread{
    public void run()
    {
        for(int i=0;i<=50;i++){
        System.out.println("this program is to demonstrate the working of thread and multi threading ");
        }
    }
}
public class example {
    public static void main(String args[])
    {
A a1=new A();
B B1=new B();
a1.start();
B1.start();
    }
}
