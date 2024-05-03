import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_4 implements ActionListener {
    JButton btn_yes;
    JButton btn_no;
    JTextField txt;

    STEP_10_GUI_4() {
        JFrame frame = new JFrame("GUI_10_4"); // gui_10_4라는 이름이 표시되는 프레임 생성

        JPanel panel = new JPanel(); // 그 안에 들어갈 패널 생성
        panel.setBackground(Color.gray); // 패널의 배경색을 회색으로
        panel.setPreferredSize(new Dimension(300, 300)); // 패널의 크기를 지정하는데, 디멘션 객체를 생성하고 그것을 값을 300, 300으로 생성하여 값을 전달

        txt = new JTextField("Click count : " + 0); // 텍스트 공간을 생성하고 초기 구성 설정
        txt.setBounds(50, 50, 200, 30); // 텍스트 필드의 크기와 위치 설정

        btn_yes = new JButton("Yes"); // 버튼을 생성하고 버튼의 이름을 Yes로 설정
        btn_yes.setBounds(100, 100, 80, 30); // 버튼의 크기와 위치 설정

        btn_no = new JButton("No"); // 버튼을 생성하고 버튼의 이름을 No로 설정
        btn_no.setBounds(100, 150, 80, 30); // 버튼의 크기와 위치 설정

        btn_yes.addActionListener(this); // yes에 대한 액션 리스너를 생성하고 이 클래스(객체)를 넘겨준다.
        btn_no.addActionListener(this); // no에 대한 액션 리스너를 생성하고 이 클래스(객체)를 넘겨준다.

        JButton btn_end = new JButton("End"); // 버튼을 생성하고 버튼의 이름을 End로 설정
        btn_end.setBounds(100, 250, 80, 30); // 버튼의 크기와 위치 설정
        btn_end.addActionListener(new ActionListener() { // end에 대한 액션 리스너를 생성하고 새로운 액션 리스너를 생성하여 종료에 대한 내용 작성 후 그 내용을 넘겨준다.
            int i = 0;
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.setLayout(null); // 패널의 레이아웃을 기본값으로 설정
        panel.add(txt); // 텍스트 공간 객체를 패널에 추가
        panel.add(btn_yes); // yes 버튼 객체 추가
        panel.add(btn_no); // no 버튼 객체 추가
        panel.add(btn_end); // end 버튼 객체 추가

        frame.getContentPane().add(panel); // 프레임의 
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.actionPerformed(ActionEvent e)) {
            txt.setText("Yes Count : " + ++nc1);
        } else {
            txt.setText("No Count : " + ++nc1);
        }
    }

    public static void main(String[] args) {
        STEP_10_GUI_4 main_obj = new STEP_10_GUI_4();
        System.out.println("Console thread is going out !!!");
    }
}