
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
        lblCount = new JLabel("60");//lbl count starts at 60 seconds
        add(lblCount);
        lblScore = new JLabel("0");//lbl score starts at 0
        add(lblScore);

    }

    void UpdateLabel(int _nCount) {
        nCount = _nCount;
        sCount = Integer.toString(nCount);//makes sCount into an integer
        lblCount.setText(sCount); 
        
    }
    void UpdateLabel1(int _nScore) {
    nScore = _nScore;
        sScore = Integer.toString(nScore);//makes sScore into an integer
        lblScore.setText(sScore);
    }
}

