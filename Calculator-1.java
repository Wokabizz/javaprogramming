import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the first number
        System.out.print("Enter the first number:");
        double num1=scanner.nextDouble();
        // Enter an operation
        System.out.print("Enter an operation(+,-,*,/):");
        char operation=scanner.next().charAt();
        // Enter second number
        System.out.print("Enter the second number:");
        double num1=scanner.nextDouble();
        // Perform the operations
        switch(operation) {
            case'+':
            result=num1+num2;
            break;
            case'-':
            result=num1-num2;
            break;
            case'*':
            result=num1*num2;
            break;
            case'/':
            result=num1/num2;
            break;
            if(num2 !=0) {
            result=num1/num2;
            }
           else{ System.out.printIn("Error:Division by zero is not allowed.");
           validOperation=false;
        }
        break;
        default:
        System.out.printIn("Error:Invalid operation.");
        validOperation=false;
        break;
    }
    // Display results
    if(validOperation){
    System.out.printIn("The result is:" + result);
    
    // End result
    scanner.close();
    }

    }
     
}
