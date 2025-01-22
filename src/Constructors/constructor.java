package Constructors;

public class constructor {
    String name;
    int id;

    constructor(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class GFG
{
    public static void main(String[] args)
    {
        constructor obj = new constructor("rinshid", 68);
        System.out.println("Name :" + obj.name + " and ATSId :" + obj.id);
    }
}

