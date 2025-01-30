package concurrent;
import java.util.concurrent.CompletableFuture;


public class Sample {
    public static void main(String args[])
    {
        CompletableFuture.supplyAsync(() -> "Hello, mohammed rinshid !")
                .thenAccept(System.out::println);
    }
}
