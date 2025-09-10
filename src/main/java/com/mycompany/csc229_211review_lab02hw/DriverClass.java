/**
 *
 * @author MoaathAlrajab
 */

import java.util.Scanner;

/**
 * DriverClass is the entry point of the program.
 * It creates a Student object, takes GPA input from the user,
 * and prints the student details.
 */
public class DriverClass {

    public static void main(String[] args) {
        // Create a new Student object with a name and age
        Student std1 = new Student("James", 20);

        // Create a Scanner object to take GPA input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA for " + std1.getName() + ": ");

        // Read GPA input from the user and set it in the Student object
        double gpa = sc.nextDouble();
        std1.setGpa(gpa);

        // Print the Student object details (uses the overridden toString method)
        System.out.println(std1);
    }
}
