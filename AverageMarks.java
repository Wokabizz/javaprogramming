import java.util.Scanner;
public class AverageMarks {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Array to store marks of five units
        double[] marks = new double[5];
        double total = 0.0;
        // Enter the marks for five units
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " +(i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            total += marks[i];
        }
        // Compute the average
        double average = total / 5;
        // Display the average with two decimal places
        System.out.printf("The average mark is: %.2f%n," average);
        // End results
        scanner.close();


    }
    
}
