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

    PanDisp panDisp;

    public PanColour(PanDisp _panDisp) {
        panDisp = _panDisp;
        setLayout(new GridLayout(3, 1));
        // notice now that I created a new BtnColour class that takes the name and 
        // the color variable. Look at the BtnColour class which extends JButton
        BtnColour btnRed = new BtnColour("Red", Color.red);
        BtnColour btnBlue = new BtnColour("Blue", Color.blue);
        BtnColour btnGreen = new BtnColour("Green", Color.green);
        add(btnRed);
        add(btnBlue);
        add(btnGreen);

        class ColourChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                // I get the source of the click, and then I can find out what color has been assigned 
                //to that button.   
                int nRand = (int) (Math.random() * 3) + 1;
                BtnColour btn = (BtnColour) event.getSource();
                Color c = btn.getColour();


                if (c.equals(Color.green)) {
                    panDisp.SetBackground(nRand);

                } else if (c.equals(Color.red)) {
                    panDisp.SetBackground(nRand);
                }else if (c.equals(Color.blue)){
                     panDisp.SetBackground(nRand);
            }
        }
        }
        ActionListener colourChangeListener = new ColourChangeListener();
        // all 3 buttons call the same listener
        btnRed.addActionListener(colourChangeListener);
        btnBlue.addActionListener(colourChangeListener);
        btnGreen.addActionListener(colourChangeListener);


    }
}
