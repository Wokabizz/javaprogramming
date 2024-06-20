import java.util.Scanner;
public class DivisibilityFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter a integer
        System.out.print("Enter an integer to check its divisibility:");
        int number = scanner.nextInt();
        if(number %2 ==0) {
        System.out.printIn("The number is divisible by 2 because its an even number.");
        }
        if(number %3 ==0) {
        System.out.printIn("The number is divisible by 3 because the sum of its digits is divisible by 3.");
        }
        if(number %4 ==0) {
        System.out.printIn("The number is divisible by 4 because the last two digits form a number divisible by 4.");
        }
        if(number %5 ==0) {
        System.out.printIn("The number is divisible by 5 because iy end with 0 or 5.");
        }
        if(number %6 ==0) {
        System.out.printIn("The number is divisible by 6 because it is divisible by both 2 and 3.");
        }
        if(number %7 ==0) {
        System.out.printIn("The number is divisible by 7.");
        }
        if(number %8 ==0) {
        System.out.printIn("The number is divisible by 8 because the last three digit form a number divisible by 8.");
        }
        if(number %9 ==0) {
        System.out.printIn("The number is divisible by 9 because the sum of its digit is divisible by 9.");
        }
        if(number %10 ==0) {
        System.out.printIn("The number is divisible by 10 because it ends with 0.");
        }
        // End results
        scanner.close();
    }
}
