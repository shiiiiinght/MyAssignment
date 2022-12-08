// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class GravitationalPotentialEnergy{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final double ACCELERATION_OF_GRAVITY = 9.81; // meters per second squared
        // VARIABLE DECLARATION
        double mass;//kilograms
        double height;//meters
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        // SOLUTION
        // Double Keyboard Input
        System.out.println("Enter the mass of the object: ");
        mass = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        System.out.println("Enter the height of the object: ");
        height = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        keyboardInput.close();
        // Screen Output
        System.out.println("Mass: " + mass + " kilograms");
        System.out.println("Acceleration of Gravity: " + ACCELERATION_OF_GRAVITY + " meters per second squared");
        System.out.println("Height: " + height + " meters");
    }
}