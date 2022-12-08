// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class driverAssistance{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZAITON
        final String CAR = "Ferrari F8";
        final double TOP_SPEED = 340.1; // kilometers per hour
        final double DRY_WEIGHT = 1329.9; // kg
        final int SPEED_LIMIT = 100; // kilometers per hour
        // VARIABLE DECLARATION
        double carWeight; // kg
        double carSpeed; // kilometers per hour
        
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Car Weight
        System.out.println("Enter the weight of the car: (kg)");
        carWeight = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        
        if (carWeight < DRY_WEIGHT){
            System.out.println("Danger the car weight is less than the dry weight.");
        } else if (carWeight == DRY_WEIGHT){
            System.out.println("Warning the car does not have oil or gasoline.");
        } else {
            System.out.println("Car weight is acceptable");
        }
        
        // Car Speed
        System.out.println("Enter the car speed: (kilometers per hour)");
        carSpeed = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        keyboardInput.close();
        
        if(carSpeed > TOP_SPEED){
            System.out.println("Danger you are exceeding the car's top speed");
        } else if (carSpeed == TOP_SPEED){
            System.out.println("Warning you are driving at the car's top speed");
        } else if (carSpeed > SPEED_LIMIT){
            System.out.println("Warning you are exceeding the speed limit");
        } else if (carSpeed == SPEED_LIMIT){
            System.out.println("You are driving at the speed limit");
        } else {
            System.out.println("You are safely driving at the speed limit");
        }
    }
}