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
    private int nScore;
    public static int nCount;
    Timer timer;
     PanGameOver pangameover = new PanGameOver();
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
        Color c = null;
        System.out.println(nRand);
        if (nRand == 1) {
            c = Color.blue;
        } else if (nRand == 2) {
            c = Color.red;
        } else if (nRand == 3) {
            c = Color.green;
        } else if (nRand == 4) {
            c = Color.orange;
        } else if (nRand == 5) {
            c = Color.yellow;
        } else if (nRand == 6) {
            c = Color.magenta;
        }
        setBackground(c);
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {

          Color c=(Color.green);
            if (c.equals(Color.green)) {
                nScore++;
                System.out.println(nScore + "This is the score!");
                 panOut.UpdateLabel1(nScore);
                    System.out.println(nScore);
            }
            if(nCount>0){
            nCount--;
            panOut.UpdateLabel(nCount);
            System.out.println(nCount);
        }else if(nCount==0){
            
           pangameover.setVisible(true);
        }
    };//if (nCount==0{)

    // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
    //timer = new Timer(1000, updateTask).start();
};
            }