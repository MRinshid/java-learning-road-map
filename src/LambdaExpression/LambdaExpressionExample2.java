package LambdaExpression;
interface Addabable{
    int add(int a,int b);
}

public class LambdaExpressionExample2 {
    public static void main(String args[])
    {
        Addabable ad=(a,b)->(a+b);
        System.out.println(ad.add(25,24));

    }
}
