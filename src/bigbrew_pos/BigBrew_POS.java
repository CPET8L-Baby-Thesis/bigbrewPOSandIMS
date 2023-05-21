/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigbrew_pos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author JOIBOI
 */
public class BigBrew_POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            //creates new sub window for the POS
            userAuth auth = new userAuth();
            mainPOS mainPOS = new mainPOS();
            auth.setVisible(true);
            
            // Center the userAuth frame on the screen
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            int frameWidth = auth.getWidth();
            int frameHeight = auth.getHeight();
            int x = (screenWidth - frameWidth) / 2;
            int y = (screenHeight - frameHeight) / 2;
            auth.setLocation(x, y);
            
            
        });
    }
    
}
