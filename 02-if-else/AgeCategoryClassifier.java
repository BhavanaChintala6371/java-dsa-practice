import java.util.Scanner;

/**
 * Problem: Age Category Classifier
 * 
 * Write a program that takes a person's age as input and determines 
 * which age category they fall into:
 * - Child: age < 13
 * - Teenager: 13 <= age < 18
 * - Young Adult: 18 <= age < 65
 * - Senior: age >= 65
 * 
 * Also validate that the age is within a reasonable range (0-150 years)
 */
public class AgeCategoryClassifier {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Age Category Classifier ===");
        System.out.print("Enter your age: ");
        
        int age = sc.nextInt();
        
        // Validate age
        if (age < 0 || age > 150) {
            System.out.println("Invalid age! Please enter an age between 0 and 150.");
        }
        else if (age < 13) {
            System.out.println("Category: Child");
            System.out.println("Description: You are in the childhood years.");
        }
        else if (age < 18) {
            System.out.println("Category: Teenager");
            System.out.println("Description: You are in the teenage years.");
        }
        else if (age < 65) {
            System.out.println("Category: Young Adult");
            System.out.println("Description: You are in the young adult years.");
        }
        else {
            System.out.println("Category: Senior");
            System.out.println("Description: You are in the senior years.");
        }
        
        sc.close();
    }
}
