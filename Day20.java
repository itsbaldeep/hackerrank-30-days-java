import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int swaps = 0;
        for (int j = 0; j < n; j++)
            for (int i = 0; i < n - 1; i++)
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swaps++;
                }
        System.out.format("Array is sorted in %d swaps.", swaps).println();
        System.out.format("First Element: %d", a[0]).println();
        System.out.format("Last Element: %d", a[n - 1]);
    }
}