package ParallelArraySorting;
import java.util.Arrays;

public class ParallelArraySorting {
    public static void main(String args[]) {
        int[] arr = {4, 5, 20, 1, 34, 6};
        for (int i : arr) {
            System.out.println(i + "");
        }
        Arrays.parallelSort(arr, 0, 2);
        System.out.println("elements after sorting :");
        for (int i : arr) {
            System.out.println(i + "");
        }
    }
}

