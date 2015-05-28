/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a.m.summative;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        JMainPan panMain = new JMainPan();
        setSize(400, 400);
        setTitle("Empty Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}