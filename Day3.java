import java.util.Scanner;
public class Day3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");    
        System.out.println(
                N%2 != 0 ? "Weird" : 
                N >= 2 && N <= 5 ? "Not Weird" :
                N >= 6 && N <= 20 ? "Weird" : "Not Weird");
        scanner.close();
    }
}
