import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class STEP_10_GUI_3 {
    public static void main(String[] args) {
        class btnListener implements ActionListener {
            JTextField txt;
            int nc1 = 0;
            int nc2 = 0;
    
            btnListener(JTextField txt) {
                this.txt = txt;
            }
    
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Yes")){
                    txt.setText("Yes Count : "+ ++nc1);
                } else if(e.getActionCommand().equals("No")){
                    txt.setText("No Count : "+ ++nc2);
                } else {
                    System.exit(0);
                }
            }
        }

        JFrame frame = new JFrame("GUI_10_3");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 400));

        JTextField txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);

        JButton btn_yes = new JButton("Yes");
        btn_yes.setBounds(150, 150, 80, 30);
        JButton btn_no = new JButton("No");
        btn_no.setBounds(150, 200, 80, 30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 300, 80, 30);
        // 요소들 생성

        btnListener lsnr_yne = new btnListener(txt);
        btn_yes.addActionListener(lsnr_yne);
        btn_no.addActionListener(lsnr_yne);
        btn_end.addActionListener(lsnr_yne);
        // 액션 추가하기

        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_yes);
        panel.add(btn_no);
        panel.add(btn_end);
        // 요소들 삽입

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // 전체 설정

        System.out.println("Console thread is going out !!!");
    }
}