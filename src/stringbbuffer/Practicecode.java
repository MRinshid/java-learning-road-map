package stringbbuffer;

public class Practicecode {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("mohammed");
        sb.append("rinshid");
        System.out.println(sb);
        StringBuffer r=new StringBuffer("rins");
        r.insert(0,"A");
        System.out.println(r);
        r.replace(0,1,"moha");
        System.out.println(r);
    }
}
