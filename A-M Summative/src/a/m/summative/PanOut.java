
package a.m.summative;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanOut extends JPanel // panel definition
{

    int nCount,nScore;
    String sCount,sScore;
    private JLabel lblCount;
     private JLabel lblScore;

    public PanOut() {
        lblCount = new JLabel("60");
        add(lblCount);
        lblScore = new JLabel("0");
        add(lblScore);

    }

    void UpdateLabel(int _nCount) {
        nCount = _nCount;
        sCount = Integer.toString(nCount);
        lblCount.setText(sCount); 
        
    }
    void UpdateLabel1(int _nScore) {
    nScore = _nScore;
        sScore = Integer.toString(nScore);
        lblScore.setText(sScore);
    }
}

