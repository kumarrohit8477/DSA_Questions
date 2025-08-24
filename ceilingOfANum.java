public class ceilingOfANum {
   public int ceiling(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;

      if (target > arr[end]) {
         return -1; // Ceiling doesn't exist
      }

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (arr[mid] == target) {
            return arr[mid];
         } else if (arr[mid] < target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return arr[start]; // The smallest number greater than or equal to target
   }

   public static void main(String[] args) {
      ceilingOfANum obj = new ceilingOfANum();
      int[] arr = {1, 2, 8, 10, 10, 12, 19};
      int target =13;

      int result = obj.ceiling(arr, target);
      if (result != -1) {
         System.out.println("The ceiling of " + target + " is: " + result);
      } else {
         System.out.println("Ceiling doesn't exist for " + target);
      }
   }
   
}