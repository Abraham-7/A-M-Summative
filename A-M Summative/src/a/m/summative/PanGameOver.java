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
    
    public PanGameOver() {
     //   public Image=background;
        if (PanDisp.nCount == 0) {
            System.out.println("Game over2");
           PanDisp.nCount=-1;
            }
       
        }
     public void GameScreen(int nCount) throws IOException {
         ImageIcon p1 = new ImageIcon("game-over.jpg");
    }
}
