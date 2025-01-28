package LambdaExpression;
    interface Example {
        public String say(String name);
    }
    public class LambdaExpression{
        public static void main(String[] args) {
            Example s1=(name)->{
                return "Hello, "+name;
            };
            System.out.println(s1.say("mohammed"));
            Example s2= name ->{
                return "Hello, "+name;
            };
            System.out.println(s2.say("rinshid"));
        }
    }


