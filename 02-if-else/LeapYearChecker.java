/**
 * Problem: Check if a Year is a Leap Year
 * 
 * Definition:
 * A leap year is a year that has 366 days instead of 365.
 * 
 * Rules:
 * 1. If a year is divisible by 400 → It is a LEAP YEAR
 * 2. Else if a year is divisible by 100 → It is NOT a leap year
 * 3. Else if a year is divisible by 4 → It is a LEAP YEAR
 * 4. Otherwise → It is NOT a leap year
 * 
 * Time Complexity: O(1) - Constant time
 * Space Complexity: O(1) - No extra space
 */

public class LeapYearChecker {

    /**
     * Checks whether a given year is a leap year
     * 
     * @param year The year to check
     * @return true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // Divisible by 400 → Leap year (e.g., 2000, 2400)
        if (year % 400 == 0) {
            return true;
        }
        // Divisible by 100 but not 400 → Not a leap year (e.g., 1700, 1800, 1900)
        else if (year % 100 == 0) {
            return false;
        }
        // Divisible by 4 but not 100 → Leap year (e.g., 2004, 2008, 2012)
        else if (year % 4 == 0) {
            return true;
        }
        // All other years → Not a leap year
        else {
            return false;
        }
    }

    /**
     * Alternative single-line implementation using logical operators
     * More concise but equivalent logic
     */
    public static boolean isLeapYearShort(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println("===== LEAP YEAR CHECKER =====\n");

        // Test cases with expected results
        int[] testYears = { 2000, 1900, 2004, 2001, 2024, 2023, 2100, 2400 };

        System.out.println("Year | Is Leap Year? | Reason");
        System.out.println("-----|---------------|-------");

        for (int year : testYears) {
            boolean isLeap = isLeapYear(year);
            String reason = getLeapYearReason(year);
            System.out.printf("%4d | %13s | %s\n", year, (isLeap ? "YES ✓" : "NO ✗"), reason);
        }
    }

    /**
     * Helper method to explain why a year is/isn't a leap year
     */
    private static String getLeapYearReason(int year) {
        if (year % 400 == 0) {
            return "Divisible by 400";
        } else if (year % 100 == 0) {
            return "Divisible by 100 (not 400)";
        } else if (year % 4 == 0) {
            return "Divisible by 4 (not 100)";
        } else {
            return "Not divisible by 4";
        }
    }
}

/*
 * EXPLANATION OF LOGIC:
 * ====================
 * 
 * Why the ORDER of conditions matters:
 * 
 * ❌ WRONG ORDER (if we don't check 400 first):
 * if (year % 100 == 0) return false;  // Would say 2000 is NOT leap (WRONG!)
 * if (year % 4 == 0) return true;
 * 
 * ✓ CORRECT ORDER (what we do):
 * if (year % 400 == 0) return true;   // 2000 is leap (CORRECT!)
 * if (year % 100 == 0) return false;  // Then check 100
 * if (year % 4 == 0) return true;     // Then check 4
 * 
 * REAL EXAMPLES:
 * ==============
 * 
 * Year 2000: Leap Year ✓
 * - 2000 % 400 = 0 → TRUE (matches first condition)
 * - Result: LEAP YEAR
 * 
 * Year 1900: NOT Leap Year ✗
 * - 1900 % 400 = 300 (not 0)
 * - 1900 % 100 = 0 → TRUE (matches second condition)
 * - Result: NOT LEAP YEAR
 * 
 * Year 2024: Leap Year ✓
 * - 2024 % 400 = 24 (not 0)
 * - 2024 % 100 = 24 (not 0)
 * - 2024 % 4 = 0 → TRUE (matches third condition)
 * - Result: LEAP YEAR
 * 
 * Year 2023: NOT Leap Year ✗
 * - 2023 % 400 = 23 (not 0)
 * - 2023 % 100 = 23 (not 0)
 * - 2023 % 4 = 3 (not 0)
 * - Result: NOT LEAP YEAR
 * 
 * INTERESTING FACTS:
 * ==================
 * - Every 4 years is usually a leap year (Gregorian calendar)
 * - BUT century years (1700, 1800, 1900, 2000) are leap only if divisible by 400
 * - This ensures the calendar year doesn't drift from the solar year
 * - Without leap years, we'd lose ~5.8 hours every year!
 */
