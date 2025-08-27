public class NextGreatestLetter {
   public char nextGreaterLettter(char[] Letter,char target){
      int start=0;
      int end = Letter.length-1;
      while(start<=end){
         int mid = start + (end-start)/2;
         if(target<Letter[mid]){
            end = mid -1;
         }else{
            start = mid + 1;
         }
      }
      return Letter[start % Letter.length];
   }
   public static void main(String[] args) {
      NextGreatestLetter ngl = new NextGreatestLetter();
      char[] letters = {'c','f','j'};
      char target = 'j';
      System.out.println(ngl.nextGreaterLettter(letters, target));
   }
}
