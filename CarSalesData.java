// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class CarSalesData{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final String CAR_MODEL = "Ferarri F8";
        final double SUGGESTED_RETAIL_PRICE = 275000;

        // VARIABLE DECLARATION
        double actualPurchasePrice;
        String nameOfTheSalesPerson;
        int employeeIdentificationNumber;
        double discount;
        double commission;
        
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter the actual purchase price: ");
        actualPurchasePrice = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        
        System.out.println("Enter the name of the sales person: ");
        nameOfTheSalesPerson = keyboardInput.nextLine();
        
        System.out.println("Enter the employee identification number: ");
        employeeIdentificationNumber = keyboardInput.nextInt();
        keyboardInput.nextLine();
        keyboardInput.close();
        
        // Calculations
        discount =  SUGGESTED_RETAIL_PRICE - actualPurchasePrice;
        commission = (actualPurchasePrice * 0.1) - (discount * 0.05);

        // Screen Output
        System.out.println("12345678901234567890123456789012345678901234567890");
        System.out.printf("Employee Identification Number:%010d%n", employeeIdentificationNumber);
        System.out.printf("Sales Person:%-10s California, USA%n", nameOfTheSalesPerson);
        System.out.printf("Car Model:%30s Hardtop%n", CAR_MODEL);
        System.out.printf("Suggested Retail Price:%,15.2f%n", SUGGESTED_RETAIL_PRICE);
        System.out.printf("Actual Purchase Price:%15.2e%n", actualPurchasePrice);
        System.out.printf("Discount:%(15.2f%n", discount);
        System.out.printf("Commission;%+15.2f%n", commission);
    }
}