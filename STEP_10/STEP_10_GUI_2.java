import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class STEP_10_GUI_2 {
    static class clickListener implements ActionListener {
        JTextField txt;
        int nc = 0;

        clickListener(JTextField txt) {
            this.txt = txt;
        }

        public void actionPerformed(ActionEvent e) {
            txt.setText("Click count : " + ++nc);
        }
    }

    static class nameClickListener implements ActionListener {
        JTextField nametext;
        int nc = 0;

        nameClickListener(JTextField nametext) {
            this.nametext = nametext;
        }

        public void actionPerformed(ActionEvent e) {
            nametext.setText("장원영의 코딩 횟수 : " + ++nc);
        }
    }

    static class endListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI_10_2");
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);

        JTextField nametext = new JTextField("장원영의 코딩 횟수 : " + 0);
        nametext.setBounds(100, 50, 200, 30);

        JButton btn_click = new JButton("Click");
        btn_click.setBounds(150, 200, 80, 30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 300, 80, 30);

        clickListener atl_click = new clickListener(txt);
        nameClickListener nameatl_click = new nameClickListener(nametext);
        btn_click.addActionListener(atl_click);
        btn_click.addActionListener(nameatl_click);
        btn_end.addActionListener(new endListener());

        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_click);
        panel.add(btn_end);
        panel.add(nametext);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going out !!!");
    }
}