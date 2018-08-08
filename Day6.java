import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a;
        for (int i = 0; i < n; i++) {
            a = scan.next();
            for (int j = 0; j < a.length(); j++)
            if (j%2==0) System.out.print(a.charAt(j));
            System.out.print(' ');
            for (int j = 0; j < a.length(); j++)
            if (j%2!=0) System.out.print(a.charAt(j));
            System.out.println();
        }
    }
}
