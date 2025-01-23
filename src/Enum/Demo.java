package Enum;
enum Status{
    not_started,completed,inprogress,onhold
}

public class Demo {
    public static void main(String args[])
    {
        int i=5;
        Status s=Status.not_started;
        System.out.println(s.ordinal()                                                                                                              );
    }
}
