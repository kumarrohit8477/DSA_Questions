import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt(); // Read integer from user
        System.out.println(num); // Print the integer
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.println("Enter a number:");
        obj.printNumber(sc); // Call the method
        sc.close();
        
    }
}
