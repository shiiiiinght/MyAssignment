// PROGRAMMER: Jason Wang

public class GlobalPositioningLocation
{
    // INSTANCE VARIABLES
    private double latitude; // unit; degrees
    private double longitude; // unit: degrees
    private double elevation; // unit: meters
    
    // CONSTRUCTORS
    public GlobalPositioningLocation()
    {
        latitude = 0;
        longitude = 0;
        elevation = 0;
    }
    
    public GlobalPositioningLocation(double latitude, double longitude, double elevation)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }
    
    // INSTANCE METHODS
    public double getLatitude()
    {
        return latitude;
    }
    
    public double getLongitude()
    {
        return longitude;
    }
    
    public double getElevation()
    {
        return elevation;
    }
    
    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }
    
    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }
    
    public void setElevation(double elevation)
    {
        this.elevation = elevation;
    }
}