//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
   public int peakIndexInMountainArray(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start < end) {
         int mid = start + (end - start) / 2;
         if(arr[mid]> arr[mid+1]){
            end = mid;
         } else {
            start = mid + 1;
         }
      }
      return start;
   }
   public static void main(String[] args) {
      MountainArray ma = new MountainArray();
      int[] arr = {0,2,5,14,20,21,15,13,1,0};
      System.out.println(ma.peakIndexInMountainArray(arr));
   }
}
