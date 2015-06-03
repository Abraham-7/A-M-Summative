package a.m.summative;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.*;
import java.util.*;
public class PanGameOver extends JPanel {
    PanDisp panDisp;
    public PanGameOver() {
        if (PanDisp.nCount == 0) {
            System.out.println("Game over");
           PanDisp.nCount=-1;
            }
       
        }
     public void GameScreen(int nCount) throws IOException {
         Scanner fin = new Scanner(new FileReader("game-over.jpg"));
    }
}
