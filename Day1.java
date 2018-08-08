import java.util.Scanner;
class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        System.out.println(i+scan.nextInt());
        System.out.println(d+scan.nextDouble());
        System.out.println(s+scan.next()+scan.nextLine());
        scan.close();
    }
}
