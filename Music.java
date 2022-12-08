// PROGRAMMER: Jason Wang

import java.util.Scanner;

public class Music
{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final String CATEGORY = "Music";
        final String VIDEO_HOSTING_WEBSITE = "Vevo";
        // VARIABLE DECLARATION
        String favoriteMusician;
        String favoriteMusicVideo;
        int numberOfMusicVideoAwards;
        String videoProducer;
        String musicVideoWebLink;
        double musicVideoProductionCost;
        // OBJECT CREATION
        Scanner keyboardInput = new Scanner(System.in);
        // SOLUTION
        // Keyboard Input
        System.out.println("Enter the name of your favorite band: ");
        favoriteMusician = keyboardInput.nextLine();
        System.out.println("Enter the name of your favorite music video: ");
        favoriteMusicVideo = keyboardInput.nextLine();
        System.out.println("Enter the number of music video awards: ");
        numberOfMusicVideoAwards = keyboardInput.nextInt();
        keyboardInput.nextLine();
        System.out.println("Enter the name of the video producer: ");
        videoProducer = keyboardInput.nextLine();
        System.out.println("Enter the music video production cost: ");
        musicVideoProductionCost = keyboardInput.nextDouble();
        keyboardInput.nextLine();
        System.out.println("Enter the music video web link: ");
        musicVideoWebLink = keyboardInput.nextLine();
        keyboardInput.close();
        // Screen Output
        System.out.println("Category: " + CATEGORY);
        System.out.println("Video Hosting Website: " + VIDEO_HOSTING_WEBSITE);
        System.out.println("Favorite Musician: " + favoriteMusician);
        System.out.println("Favorite Music Video: " + favoriteMusicVideo);
        System.out.println("Numebr of Music Video Awards: " + numberOfMusicVideoAwards);
        System.out.println("Video Producer: " + videoProducer);
        System.out.println("Music Video Production Cost: " + musicVideoProductionCost);
        System.out.println("Music Video Web Link: " + musicVideoWebLink);
    }
}
