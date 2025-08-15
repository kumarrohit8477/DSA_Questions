public class GCDofTwoNum {
   public int gcd(int a, int b) {
      if (b == 0) {
         return a;
      }
      return gcd(b, a % b);
   }
   public static void main(String[] args) {
      GCDofTwoNum gcdCalculator = new GCDofTwoNum();
      int a = 8;
      int b = 1;
      System.out.println(gcdCalculator.gcd(a, b));
   }
   
}
