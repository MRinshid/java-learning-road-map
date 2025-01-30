package concurrent;
import java.util.List;
import java.util.concurrent.*;
import java.util.Arrays;


public class Example {
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.parallelStream().forEach(num ->
                System.out.println(Thread.currentThread().getName() + " : " + num)
        );
    }
    }

