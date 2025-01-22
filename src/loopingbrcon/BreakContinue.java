package loopingbrcon;

public class BreakContinue {
    public static void main (String args[])
    {
        for(int i=0;i<5;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        for(int a=0;a<5;a++)
        {
            if(a==3)
            {
                continue;
            }
            System.out.println(a);
        }
    }
}
