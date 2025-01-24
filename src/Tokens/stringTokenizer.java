package Tokens;

import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("My name is rinshid", "");
        System.out.println("Total number of Tokens: "+st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            //System.out.println("Total number of Tokens: "+st.countTokens());
        }
        StringTokenizer as = new StringTokenizer("Hello everyone I am Learning Java "," ");
        System.out.println("Total number of Tokens: "+as.countTokens());
        while (as.hasMoreElements())
        {
            System.out.println(as.nextToken());
        }
       // System.out.println("Total number of Tokens: "+st.countTokens());
    }
}