import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_3 {

    public static void main(String[] args) {
        class btnListener impliments ActionListener{
            JTextField txt;
            int nc1 = 0, nc2 = 0;

            btnListener(JTextField txt) {
                this.txt = txt;
            }

            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Yes")){
                    txt.setText("Yes count : ");
                }
            }
        }
    }
}