import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1_000_000;

        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long sum1 = 0;
        for (int i : list) sum1 += i;
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        long sum2 = 0;
        for (int i : arr) sum2 += i;
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (end1 - start1));
        System.out.println("Array time: " + (end2 - start2));
    }
}