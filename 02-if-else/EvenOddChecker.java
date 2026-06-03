public class EvenOddChecker {
    
    /**
     * Problem: Even/Odd Number Checker with Additional Conditions
     * 
     * Given a number, determine:
     * 1. If it's even or odd
     * 2. If it's even, check if it's divisible by 4
     * 3. If it's odd, check if it's divisible by 3
     * 4. Check if the number is positive, negative, or zero
     * 
     * Example:
     * Input: 12
     * Output: "12 is even, divisible by 4, and positive"
     * 
     * Input: 15
     * Output: "15 is odd, divisible by 3, and positive"
     * 
     * Input: 10
     * Output: "10 is even, not divisible by 4, and positive"
     * 
     * Input: -8
     * Output: "-8 is even, divisible by 4, and negative"
     */
    
    public static String checkNumber(int num) {
        String result = "";
        
        // Check if number is positive, negative, or zero
        String sign;
        if (num > 0) {
            sign = "positive";
        } else if (num < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        
        // Check if even or odd
        if (num % 2 == 0) {
            result += num + " is even";
            
            // If even, check if divisible by 4
            if (num % 4 == 0) {
                result += ", divisible by 4";
            } else {
                result += ", not divisible by 4";
            }
        } else {
            result += num + " is odd";
            
            // If odd, check if divisible by 3
            if (num % 3 == 0) {
                result += ", divisible by 3";
            } else {
                result += ", not divisible by 3";
            }
        }
        
        // Add sign information
        result += ", and " + sign;
        
        return result;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(checkNumber(12));      // Even, divisible by 4, positive
        System.out.println(checkNumber(15));      // Odd, divisible by 3, positive
        System.out.println(checkNumber(10));      // Even, not divisible by 4, positive
        System.out.println(checkNumber(9));       // Odd, divisible by 3, positive
        System.out.println(checkNumber(-8));      // Even, divisible by 4, negative
        System.out.println(checkNumber(-7));      // Odd, not divisible by 3, negative
        System.out.println(checkNumber(0));       // Even, divisible by 4, zero
        System.out.println(checkNumber(2));       // Even, not divisible by 4, positive
        System.out.println(checkNumber(21));      // Odd, divisible by 3, positive
        System.out.println(checkNumber(-6));      // Even, not divisible by 4, negative
    }
}
