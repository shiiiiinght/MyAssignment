// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class Login{
    public static void main(String[] args){
        // CONSTANT DECALRATION AND INITIALIZATION
        final String CORRECT_USERNAME = "student";
        final String CORRECT_PASSWORD = "abc123";
        
        // VARIABLE DECLARATION
        int loginAttempts;
        String username;
        String password;
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Initialize values
        loginAttempts = 0;
        
        // Do Loop
        do{
            loginAttempts++;
            System.out.printf("Login Attempts:%5d%n", loginAttempts);
            System.out.print("Enter Username: ");
            username = keyboardInput.next();
            keyboardInput.nextLine();
            System.out.print("Enter Password: ");
            password = keyboardInput.next();
            keyboardInput.nextLine();
        } while(!username.equals(CORRECT_USERNAME) || !password.equals(CORRECT_PASSWORD));
        keyboardInput.close();
        
        // Login Statistics
        System.out.println("LOGIN SUCCESSFUL");
        System.out.print("You Successfully Logged In On Your " + loginAttempts + " try");
        
    }
}