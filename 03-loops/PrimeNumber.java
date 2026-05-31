// Problem: Check whether a number is prime
// Input: number = 17
// Output: Prime number
// Approach:
// A prime number is greater than 1 and divisible only by 1 and itself.
// We check whether the number is divisible by any number from 2 to number - 1.

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}