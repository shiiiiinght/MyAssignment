// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class EnumerationTypes{
    public enum FlowchartElement{INPUT, OUTPUT, CONDITION, TASK}
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        
        // VARIABLE DECLARATION
        String command;
        FlowchartElement symbol;
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter A Java Command: ");
        command = keyboardInput.next();
        keyboardInput.nextLine();
        keyboardInput.close();
        
        // Switch Statement
        switch (command){
            case "if":
            case "switch":
                symbol = FlowchartElement.CONDITION;
                break;
            case "nextLine":
            case "nextInt":
            case "nextDouble":
            case "nextBoolean":
                symbol = FlowchartElement.INPUT;
                break;
            case "prinbtln":
            case "print":
            case "printf":
                symbol = FlowchartElement.OUTPUT;
                break;
            default:
                symbol = FlowchartElement.TASK;
        }
        
        // Screen Output
        System.out.println("Command: " + command);
        System.out.println("Symbol: " + symbol);
        
    }
}