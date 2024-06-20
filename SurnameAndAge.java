import java.util.Scanner;
    public class SurnameAndAge {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            //Enter the Surname
            System.out.print("Enter their Surname:");
            String Surname = scanner.nextLine();
            //Enter their age
            System.out.print("Enter your current age");
            int age = scanner.nextInt();
            // Calculate the number of characters in the surname
            int surnameLength = surnmae.length();
            //Is age even or odd
            String ageType = (age %2 ==0)? "even" : "odd";
            
            //Show the results
            System.out.printIn("The number of characters in your surname is" + surnameLength + ".");
            System.out.printIn("Your current age is an" + ageType + "number");
            // End results
            scanner.close();
       
        }
    
        
    
}
