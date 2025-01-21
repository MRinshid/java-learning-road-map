package Operators;

public class operations {
    public static void main(String args[])
    {
        int x=10,r=9;
        int y=20,s=4;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x++ + y++);
        System.out.println(s--);
        System.out.println(--r);
        System.out.println(x<y&&x<r);
        int a=10,b=5,c=20;
        System.out.println(a>b||a<c);
        System.out.println(a>b|a<c);
        int min=(a<b)?a:b;
        System.out.println(min);
        a+=b;
        System.out.println(a);
    }
}
