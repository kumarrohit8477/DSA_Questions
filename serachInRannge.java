public class serachInRannge {
   public static void main(String[] args) {
      int[] arr = {45, 78, 48, 47, 87, 49, 34, 28, 56, 89};
      int target = 89;
      System.out.println(search(arr, target ,1,5));
      System.out.println(search(arr, target=47,1,5));
   }
   public static int search(int[] arr, int target, int start, int end) {
      for (int i = start; i <=end; i++) {
         if (arr[i] == target) {
            return i;
         }
      }
      return -1;
   }
}
