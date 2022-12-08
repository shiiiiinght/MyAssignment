// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class IndustrailRobot{
    public static void main(String[] args){
        // CONSTANT DECALRATION AND INITIALIZATION
        final String CONTROL_LANGUAGE = "G-Code";
        
        // VARIABLE DECLARATION
        String command;
        String roboticOperation = "";
        
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter the robotic command: ");
        command = keyboardInput.next();
        keyboardInput.nextLine();
        keyboardInput.close();
        
        // Switch Statement
        switch (command){
            case "G00":
                roboticOperation = "Move in straight line at rapid speed";
                break;
            case "G01":
                roboticOperation = "Move in the straight line a specified speed";
                break;
            case "G02":
                roboticOperation = "Move in a clockwise arc";
                break;
            case "G20":
                roboticOperation = "Units are inches";
                break;
            case "G21":
                roboticOperation = "Units are millimeters";
                break;
            case "M00":
                roboticOperation = "Stop";
                break;
            default:
                roboticOperation = "Invalid Command";
        }
        
        // Screen Output
        System.out.println("Control Language: " + CONTROL_LANGUAGE);
        System.out.println("Command: " + command);
        System.out.println("Robotic Operation: " + roboticOperation);
        
    }
}