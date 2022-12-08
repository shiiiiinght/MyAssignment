// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class Trip
{
    // STATIC FIELDS
    
    // STATIC METHODS
    public static double[] getTripSegmentDistances(int numberOfDestinations, String distanceUnit)
    {
        Scanner keyboardInput = new Scanner(System.in);
        double[] segmentDistances = new double[numberOfDestinations];
        for(int index = 0; index < segmentDistances.length; index++){
            System.out.print("Enter the trip's segment distance (" + distanceUnit + "): ");
            segmentDistances[index] = keyboardInput.nextDouble();
            keyboardInput.nextLine();
        }
        keyboardInput.close();
        return segmentDistances;
    }
    
    public static double totalTripDistance(double[] segmentDistances)
    {
        double totalDistance = 0;
        for(int index = 0; index < segmentDistances.length; index++)
        {
            totalDistance += segmentDistances[index];
        }
        return totalDistance;
    }
    
    public static double minimumTripSegmentDistance(double[] segmentDistances)
    {
        double minimumDistance = segmentDistances[0];
        for(int index = 1; index < segmentDistances.length; index++){
            if(minimumDistance > segmentDistances[index])
            {
                minimumDistance = segmentDistances[index];
            }
        }
        return minimumDistance;
    }
    
    public static double maximumtripSegmentDistance(double[] segmentDistances)
    {
        double maximumDistance = segmentDistances[0];
        for(int index = 0; index < segmentDistances.length; index++)
        {
            if(maximumDistance < segmentDistances[index])
            {
                maximumDistance = segmentDistances[index];
            }
        }
        return maximumDistance;
    }
}