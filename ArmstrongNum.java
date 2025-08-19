public class ArmstrongNum {
   public boolean isArmstrong(int n) {
      int a, b = 0, c = n;
      while (n != 0) {
         a = n % 10;                // get last digit
         b = b + (int)Math.pow(a, 3); // cube and add
         n = n / 10;                // reduce n
      }
      return b == c;
   }

   public static void main(String[] args) {
      ArmstrongNum a = new ArmstrongNum();
      System.out.println(a.isArmstrong(153)); // true
      System.out.println(a.isArmstrong(123)); // false
   }
}
