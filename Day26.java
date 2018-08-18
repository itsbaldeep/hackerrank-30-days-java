import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] actual = s.nextLine().split(" ");
        String[] expected = s.nextLine().split(" ");
        s.close();

        int actualDate = Integer.parseInt(actual[0]);
        int actualMonth = Integer.parseInt(actual[1]);
        int actualYear = Integer.parseInt(actual[2]);
        int expectedDate = Integer.parseInt(expected[0]);
        int expectedMonth = Integer.parseInt(expected[1]);
        int expectedYear = Integer.parseInt(expected[2]);

        int fine = 0;
        if (expectedYear < actualYear)
            fine = 10000;
        else if (expectedYear == actualYear) {
            if (expectedMonth < actualMonth)
                fine = Math.abs(expectedMonth - actualMonth) * 500;
            else if (expectedMonth == actualMonth) {
                if (expectedDate < actualDate)
                    fine = Math.abs(expectedDate - actualDate) * 15;
            }
        }
        System.out.println(fine);
    }

}