import java.util.Scanner;
public class Day2 {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double cost = meal_cost + meal_cost * tip_percent / 100 + meal_cost * tax_percent / 100;
        System.out.format("The total meal cost is %d dollars.", Math.round(cost));
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
    }
}
