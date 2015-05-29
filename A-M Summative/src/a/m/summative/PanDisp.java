/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a.m.summative;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PanDisp extends JPanel // panel definition
{

    PanOut panOut;
    private JLabel lblName;
    private String sLabel;
    private String sColour;
    private int nCount;
    Timer timer;

    public PanDisp(PanOut _panOut) {
        panOut = _panOut;
        timer = new Timer(600, updateTask);
        // this Panel will contain all of the output, therefore called PanDisp for display
        // It will be in the CENTRE of PanMain
        nCount = 60;
        timer.start();
       // setBackground(new Color(0,255,0));
        setBackground(Color.green);
    }

    void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
   
    }
   public void SetBackground(int nRand) {
        Color c=null;
        System.out.println(nRand);
        if(nRand==1){
            c=Color.blue;
        }
        else if(nRand==2){
            c=Color.red;
        }
        else if(nRand==3){
            c=Color.green;
        }
        setBackground(c);
        
   }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount--;
            panOut.UpdateLabel(nCount);
            System.out.println(nCount);
        }
    };
   
    // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
    //timer = new Timer(1000, updateTask).start();
}
