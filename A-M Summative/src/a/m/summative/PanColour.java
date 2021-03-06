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

public class PanColour extends JPanel // panel definition
{
    public int nScore, nNum;

    PanDisp panDisp;

    public PanColour(PanDisp _panDisp) {
        
        panDisp = _panDisp;
        setLayout(new GridLayout(3, 1));
        // notice now that I created a new BtnColour class that takes the name and 
        // the color variable. Look at the BtnColour class which extends JButton
        BtnColour btnRed = new BtnColour("Red", Color.red);
        BtnColour btnBlue = new BtnColour("Blue", Color.blue);
        BtnColour btnGreen = new BtnColour("Green", Color.green);
        BtnColour btnOrange = new BtnColour("Orange", Color.orange);
        BtnColour btnYellow = new BtnColour("Yellow", Color.yellow);
        BtnColour btnMagenta = new BtnColour("Magenta", Color.magenta);
        add(btnRed);
        add(btnBlue);
        add(btnGreen);
        add(btnOrange);
        add(btnYellow);
        add(btnMagenta);
        

        class ColourChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                // I get the source of the click, and then I can find out what color has been assigned 
                //to that button.   
                
                int nRand = (int) (Math.random() * 6) + 1;
                BtnColour btn = (BtnColour) event.getSource();
                Color c = btn.getColour();

                if (c.equals(Color.green)) { //sets the background of the panel a certain colour once a button is pressed
                        panDisp.SetBackground(nRand);
                    }  else if (c.equals(Color.red)) {
                    panDisp.SetBackground(nRand);
                } else if (c.equals(Color.blue)) {
                    panDisp.SetBackground(nRand);
                } else if (c.equals(Color.orange)) {
                    panDisp.SetBackground(nRand);
                } else if (c.equals(Color.yellow)) {
                    panDisp.SetBackground(nRand);
                } else if (c.equals(Color.magenta)) {
                    panDisp.SetBackground(nRand);
                }
                    
                
            }
        }
        ActionListener colourChangeListener = new ColourChangeListener();
        // all 6 buttons call the same listener
        btnRed.addActionListener(colourChangeListener);
        btnBlue.addActionListener(colourChangeListener);
        btnGreen.addActionListener(colourChangeListener);
        btnOrange.addActionListener(colourChangeListener);
        btnYellow.addActionListener(colourChangeListener);
        btnMagenta.addActionListener(colourChangeListener);


    }
}
