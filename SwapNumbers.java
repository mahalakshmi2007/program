import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        // Print original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping without a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        // Print swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        scanner.close();
    }
}
