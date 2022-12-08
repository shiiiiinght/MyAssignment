// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class IdenticalResistorInSeries{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        
        // VARIABLE DECLARATION
        String resistorManufacturer;
        int numberOfResistors;
        int resistance; // ohms
        int equivalentResistance; // ohms
        
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter the number of resistors: ");
        numberOfResistors = keyboardInput.nextInt();
        keyboardInput.nextLine();
        
        System.out.println("Enter the resistance value; ");
        resistance = keyboardInput.nextInt();
        keyboardInput.nextLine();
        
        System.out.println("Enter the name of the resistor manufacturer: ");
        resistorManufacturer = keyboardInput.nextLine();
        
        keyboardInput.close();
        
        // Caluculations
        equivalentResistance = numberOfResistors * resistance;
        
        // Screen Output
        System.out.println("12345678901234567890123456789012345678901234567890");
        System.out.printf("Resistor Manufacturer:%20s%n", resistorManufacturer);
        System.out.printf("Number of Resistors:%3d%n", numberOfResistors);
        System.out.printf("Resistance:%10d ohms%n", resistance);
        System.out.printf("Equivalent Resistance:%15d ohms%n", equivalentResistance);
        
    }
}