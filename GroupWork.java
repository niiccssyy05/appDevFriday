import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("COLLAB CALCULATION\n");
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling methods from Calculator.java
        System.out.println("(GROUP 1) Sum: " + Calculator.add(num1, num2));  // Group 1's method
        System.out.println("(GROUP 10) Are they equal? " + Calculator.isEqual(num1, num2));  // Group 10's method
        System.out.println("(GROUP 5) Remainder: " + Calculator.modulus(num1, num2));  // Group 5's method

        scanner.close(); // Close scanner to prevent resource leak
    }
}