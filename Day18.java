import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
   Stack<Character> stack = new Stack<>();
   Queue<Character> queue = new LinkedList<>();

   void enqueueCharacter(char c) {
      queue.add(c);
   }

   void pushCharacter(char c) {
      stack.add(c);
   }

   char dequeueCharacter() {
      return queue.remove();
   }

   char popCharacter() {
      return stack.pop();
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      scan.close();
      char[] s = input.toCharArray();
      Solution p = new Solution();
      for (char c : s) {
         p.pushCharacter(c);
         p.enqueueCharacter(c);
      }
      boolean isPalindrome = true;
      for (int i = 0; i < s.length / 2; i++) {
         if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;
            break;
         }
      }
      System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
   }
}