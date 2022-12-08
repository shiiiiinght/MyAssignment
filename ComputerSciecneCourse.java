//PROGRAMMER; Jason Wang

import java.util.Scanner;

public class ComputerSciecneCourse
{
    public static void main (String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final int COURSE_CODE = 170;
        final int COURSE_SECTION_NUMBER = 20948;
        // VARIABLE DECLARATION
        int numberOfRegisteredStudents;
        int numberOfWaitlistStudents;
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        // SOLUTION
        // Integer Keyboard Input
        System.out.println("Enter the number of students registered: ");
        numberOfRegisteredStudents = keyboardInput.nextInt();
        keyboardInput.nextLine();
        System.out.println("Enter the number of students on the waitlist: ");
        numberOfWaitlistStudents = keyboardInput.nextInt();
        keyboardInput.nextLine();
        keyboardInput.close();
        // Screen Output
        System.out.println("Orange Coast College");
        System.out.println("The Course Code: " + COURSE_CODE);
        System.out.println("The Course Section Number: " + COURSE_SECTION_NUMBER);
        System.out.println("The Number of Registered Students: " + numberOfRegisteredStudents);
        System.out.println("The Number of Waitlist Students: " + numberOfWaitlistStudents);
        
    }
}
