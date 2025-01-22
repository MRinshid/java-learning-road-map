package loopingbrcon;

import java.util.Scanner;

public class FORloop {
    public static void main(String args[])
    {
        int i;
        String str=new String();
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String rev="";
        char c = 0;
        for(i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            rev=c+rev;
        }
        System.out.println("reversed string is:"+rev);

    }
}

