import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        for (int j = 0; j < l; j++) {
            int n = s.nextInt();
            String res = "Prime";
            for (int i = 2; i*i <= n; i++)
                if (n % i == 0) res = "Not prime";
            System.out.println(n > 1 ? res : "Not prime");
        }
    }
}