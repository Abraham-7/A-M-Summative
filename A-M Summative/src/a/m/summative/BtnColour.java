/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a.m.summative;
import javax.swing.*;
import java.awt.*;

public class BtnColour extends JButton // panel definition
{
    private Color c;
    private String sName;

    public BtnColour(String _sName, Color _c) {//c is called the button
        sName = _sName;
        c = _c;
        
        this.setText(sName);
    }
    
    public Color getColour(){
        return c;
        
    }
}