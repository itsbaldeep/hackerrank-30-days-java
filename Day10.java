import java.util.Scanner;
public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int r = 0;
        for (String b : Integer.toString(n, 2).split("0"))
            if (r < b.length()) r = b.length();
        System.out.println(r);
        
        scanner.close();
    }
}
