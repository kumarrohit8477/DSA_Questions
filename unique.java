public class unique {
   public int removeDuplicates(int[] nums) {
      if (nums.length == 0)
         return 0;
         
      int k = 1;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
         }
      }
      return k;
   }
   public static void main(String[] args) {
      unique obj = new unique();
      int[] arr = {1,1,2,2,3,4,4,5};

      int k = obj.removeDuplicates(arr);
      System.out.println("The length of the array after removing duplicates is: " + k);
   }
}
