// Problem: Calculate grade based on marks
// Input: marks = 82
// Output: Grade A
// Approach:
// 90 and above -> Grade A+
// 80 to 89 -> Grade A
// 70 to 79 -> Grade B
// 60 to 69 -> Grade C
// 50 to 59 -> Grade D
// Below 50 -> Fail

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}