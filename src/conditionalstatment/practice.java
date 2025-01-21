package conditionalstatment;

public class practice {
    public static void main(String args[])
    {
        int x=10,y=20,a=19;
        if(x<y) {
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }
        if(a>=18)
        {
            System.out.println("eligible to vote");
        }
        else {
            System.out.println("not eligible");
        }
        int year=2020;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}
