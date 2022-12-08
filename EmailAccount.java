//PROGRAMMER: Jason Wang

import java.util.Scanner;

public class EmailAccount{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final String WEBSITE = "https://www.outlook.com";
        // VARIABLE DECLARATION
        int age;
        String firstName;
        String lastName;
        String emailDomain;
        String emailAddress;
        int emailLength;
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter your age: ");
        age = keyboardInput.nextInt();
        keyboardInput.nextLine();
        System.out.println("Enter your first name: ");
        firstName = keyboardInput.nextLine();
        System.out.println("Enter your last name: ");
        lastName = keyboardInput.nextLine();
        keyboardInput.close();
        // Text Operations
        emailDomain = WEBSITE.substring(12);
        emailAddress = firstName + lastName + "@" + emailDomain;
        emailLength = emailAddress.length();
        // Screen Output
        System.out.println("Email Account: ");
        System.out.println("Age: " + age);
        System.out.println("Email Domain: " + emailDomain);
        System.out.println("Email Address: " + emailAddress.replace(" ", ""));
        System.out.println("Email Length: " + emailLength);
        
    }
}