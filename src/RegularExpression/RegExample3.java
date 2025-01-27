package RegularExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExample3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the email to check :");
        String email=sc.nextLine();

       // String email = "mrinshid2104@gmail.com";
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email.");
        }
    }
}
