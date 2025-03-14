// GroupWork.java
import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("COLLAB CALCULATION\n");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method

        System.out.println("Multiply: " + Calculator.mul(num1, num2));  // Group 3's method
        System.out.println(" (GROUP 10 Candilada, Villoso, Maravilla," + 
                        " Saren, Bolando, Agustin, Eugenio, Oracion, Bobis, Geguiera, Dionisio) ) Are they equal? " + Calculator.isEqual(num1, num2));  // Group 10's method


    }
}
