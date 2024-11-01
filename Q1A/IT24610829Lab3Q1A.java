
import java.util.Scanner;

public class IT24610829Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for price per kg
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt user for the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculate total amount to pay
        double totalAmount = pricePerKg * quantity;

        // Display the result
        System.out.printf("The total amount to pay is: %.2f%n", totalAmount);

        // Close the scanner
        scanner.close();
    }
}
