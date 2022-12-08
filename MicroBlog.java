// PROGRAMMER: Jason Wang

import javax.swing.JOptionPane;

public class MicroBlog{
    public static void main(String[] args){
        // CONSTANT DECLARATION AND INITIALIZATION
        final String CATEGORY = "Social Media";
        final String PLATFORM = "Twitter";
        // VARIABLE DECLARATION
        String favoriteTwitterAccount;
        String secondFavoriteTwitterAccount;
        String thirdFavoriteTwitterAccount;
        // OBJECT DECLARATION
        
        // SOLUTION
        // Option Pane Input
        favoriteTwitterAccount = JOptionPane.showInputDialog("Enter favorite Twitter account: ");
        secondFavoriteTwitterAccount = JOptionPane.showInputDialog("Enter 2nd favorite Twitter account: ");
        thirdFavoriteTwitterAccount = JOptionPane.showInputDialog("Enter 3rd favorite Twitter account: ");
        
        // Option Pane Output
        JOptionPane.showMessageDialog(null, "Category: " + CATEGORY);
        JOptionPane.showMessageDialog(null, "Platform: " + PLATFORM);
        JOptionPane.showMessageDialog(null, "1st favorite Twitter account: " + favoriteTwitterAccount);
        JOptionPane.showMessageDialog(null, "2nd favorite Twitter account: " + secondFavoriteTwitterAccount);
        JOptionPane.showMessageDialog(null, "3rd favorite Twitter account: " + thirdFavoriteTwitterAccount);
    }
}
