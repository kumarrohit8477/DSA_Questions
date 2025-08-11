public class CountAllDigitsOfA_Number{
   public int countDigit(int n){
      int count = 0;
      while (n != 0) {
         n /= 10; // Remove the last digit
         count++; // Increment the count
      }
      return count; // Return the total count of digits
   }
   public static void main(String[] args) {
      CountAllDigitsOfA_Number obj = new CountAllDigitsOfA_Number();
      int number = 12345; // Example input
      System.out.println("Number of digits: " + obj.countDigit(number)); // Output: 5
   }
}

