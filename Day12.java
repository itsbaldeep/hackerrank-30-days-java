import java.util.Arrays;
import java.util.Scanner;
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    public void printPerson(){
        System.out.println(
                       "Name: " + lastName + ", " + firstName 
               + 	"\nID: " + idNumber); 
    }
}
class Student extends Person{
    private int[] testScores;
    Student(String f, String l, int i, int[] s) {
        super(f, l, i);
        testScores = s;
    }
    char calculate() {
        double a = Arrays.stream(testScores).average().orElse(Double.NaN);
        return 
            a > 89 ? 'O' : 
            a > 79 ? 'E' : 
            a > 69 ? 'A' : 
            a > 54 ? 'P' : 
            a > 39 ? 'D' : 
            'T';
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}