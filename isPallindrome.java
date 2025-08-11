public class isPallindrome {
   public boolean isPalindrome(int n){
      int copy=n,c=0,d=0;
      while(n!=0){
         c=n%10;
         n=n/10;
         d=d*10+c; // fixed
      }
      return d==copy;
   }
   public static void main(String[] args) {
      isPallindrome obj= new isPallindrome();
      int num=12321;
      System.out.println(obj.isPalindrome(num));
   }
}
