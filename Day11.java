import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int i = 1; i < arr.length - 1; i++)
            for (int j = 1; j < arr[i].length - 1; j++) {
                sum.add(arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                                    + arr[i][j]
                        +arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
            }
        System.out.println(Collections.max(sum));
        
        scanner.close();
    }
}
