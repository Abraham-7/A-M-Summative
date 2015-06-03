/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a.m.summative;
import javax.swing.*;
import java.awt.*;
public class JMainPan extends JPanel{
  PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    //PanLabelChange panLabelChange = new PanLabelChange(panDisp);
    PanColour panColour = new PanColour(panDisp);
   PanGameOver pangameover = new PanGameOver();
   
    private PanOut PanOut;

    public JMainPan() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
       // add(panLabelChange, BorderLayout.WEST);
        add(panDisp,BorderLayout.CENTER);
         add(panOut, BorderLayout.EAST);
        add(panColour, BorderLayout.SOUTH);
       // pangameover.setVisible(false);
       // add(pangameover, BorderLayout.WEST);
    }
}
