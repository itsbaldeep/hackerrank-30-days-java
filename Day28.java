import java.util.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> users = new ArrayList();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Pattern p = Pattern.compile(".+@gmail\\.com$");
            if (p.matcher(emailID).find())
                users.add(firstName);
        }
        scanner.close();
        Collections.sort(users);
        for (String user : users)
            System.out.println(user);
    }
}
