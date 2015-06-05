package a.m.summative;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
public class PanGameOver extends JPanel {
    PanDisp panDisp;
    public static Image background;
    
    public PanGameOver() {
    
        if (PanDisp.nCount == 0) { //to check if it read the panel
            System.out.println("Game over2");
           PanDisp.nCount=-1;
            }
       
        }
     public static void GameScreen(int nCount) throws IOException {
          
         ImageIcon p1 = new ImageIcon("game-over.jpg");//makes the panel display a game over picture
         background = p1.getImage();
         
    }
    @Override
     public  void paint(Graphics g) {//tried to make a put the picture up using graphics
        g.drawImage(background, 0 , 0, null);
}
}
