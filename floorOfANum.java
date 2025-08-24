public class floorOfANum {
   public int floor(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;

      if (target < arr[start]) {
         return -1; // Floor doesn't exist
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
      return arr[end]; // The largest number less than or equal to target
   }

   public static void main(String[] args) {
      floorOfANum obj = new floorOfANum();
      int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
      int target = 5;

      int result = obj.floor(arr, target);
      if (result != -1) {
         System.out.println("The floor of " + target + " is: " + result);
      } else {
         System.out.println("Floor doesn't exist for " + target);
      }
   }
}
