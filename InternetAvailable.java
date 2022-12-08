// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class InternetAvailable{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final boolean MOBILE_DEVICE_REQUIRED = true;
        // VARIABLE DECLARATION
        boolean airplaneModeOn;
        boolean cellSignal;
        boolean internetIsAccessible;
        String mobileDevice;
        String mobileNetworkProvider;
        
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        
        // SOLUTION
        // Keyboard Input
        System.out.println("Does your mobile device have the airplane mode on? (true or false)");
        airplaneModeOn = keyboardInput.nextBoolean();
        keyboardInput.nextLine();
        
        System.out.println("Enter the name of your mobile device: ");
        mobileDevice = keyboardInput.nextLine();
        
        System.out.println("Does your mobile device receive a cell signal? (true or false)");
        cellSignal = keyboardInput.nextBoolean();
        keyboardInput.nextLine();
        
        System.out.println("Enter the name of your mobile network provider: ");
        mobileNetworkProvider = keyboardInput.nextLine();
        
        keyboardInput.close();
        
        // Logical Operations
        internetIsAccessible = cellSignal && !airplaneModeOn;
        
        // Screen Output
        System.out.println();
        System.out.println("Internet Information");
        System.out.println("Mobile Device Required: " + MOBILE_DEVICE_REQUIRED);
        System.out.println("Mobile Device: " + mobileDevice);
        System.out.println("Mobile Network Provider: " + mobileNetworkProvider);
        System.out.println("Airplane Mode: " + airplaneModeOn);
        System.out.println("Cell Signal: " + cellSignal);
        System.out.println("Internet is Accessible: " + internetIsAccessible);
        
    }
}