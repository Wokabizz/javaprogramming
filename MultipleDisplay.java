// A program to find multiples of certain numbers
   public class MultipleDisplay {
     public static void main(String[] args) {

     System.out.print("Multiples of 2, 3, and 7 within the range 71 to 150:");

     for(int i = 71; i<= 150; i++){
     if(i % 2 == 0|| i % 3 == 0|| i % 7 == 0){
     System.out.print(i + "is a multiple of 2, 3, and 7");
      }
    }
  }
}