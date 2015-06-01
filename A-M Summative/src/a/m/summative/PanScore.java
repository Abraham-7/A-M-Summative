/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a.m.summative;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanScore extends JPanel {

    ActionListener click = new Click();
    JButton btnRed = new JButton("Click");
    JButton btnBlue = new JButton("Click");
    JButton btnGreen = new JButton("Click");
    JButton btnOrange = new JButton("Click");
    JButton btnYellow = new JButton("Click");
    public static int cash, clicks;

    public PanScore() {
        setLayout(new GridLayout(1, 1));

        add(btnColour);
        btnColour.addActionListener(click);
    }

    class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            
        }
    }
}