import java.awt.*;
import javax.swing.*;

public class STEP_10_GUI_1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI_10_1");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);

        JTextField nametext = new JTextField("장원영의 코딩 횟수 : " + 0);
        nametext.setBounds(100, 150, 200, 30);

        JButton btn_click = new JButton("Click");
        btn_click.setBounds(150, 200, 80, 30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 300, 80, 30);


        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_click);
        panel.add(btn_end);
        panel.add(nametext);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 프론트 ------------------------------------------------------------------------

        System.out.println("Console thread is going out !!!");
    }
}