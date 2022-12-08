// PROGRAMMER: Jason Wang 

import java.util.Scanner;

public class circleGeometry
{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final int CONVERSION_FACTOR = 2;
        // VARIABLE DECLARATION
        double diameter;// meters
        double radius;// meters
        double area;// square meters
        double circumference;// meters
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter the radius of the circle (meter): ");
        radius = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        keyboardInput.close();
        
        // Calculations
        diameter = radius * CONVERSION_FACTOR;
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        
        // Screen Ouput
        System.out.println();
        System.out.println("The conversion factor is: " + CONVERSION_FACTOR);
        System.out.println("The radius of the circle is: " + radius + " meters");
        System.out.println("The diameter of the circle is: " + diameter + " meters");
        System.out.println("The area of the circle is: " + area + " square meters");
        System.out.println("The circumference of the circle is; " + circumference + " meters");
    }
}
