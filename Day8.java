import java.util.Scanner;
import java.util.HashMap;
public class Day8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer>(); 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(map.get(s) == null ? "Not found" : s + "=" + map.get(s));
        }
        in.close();
    }
}
