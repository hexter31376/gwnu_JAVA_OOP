import java.awt.*; // 네이티브 gui 클래스 패키지
import java.awt.event.*; // 자바 이벤트리스너 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지

public class STEP_10_GUI_5 implements ActionListener {
    class MyPanel extends JPanel {
        MyPanel(){
            setBackground(Color.gray);
            setPreferredSize(new Dimension(400, 400));
        }
        public void paintComponent(Graphics g){
            g.setColor(Color.red);
            g.drawRect(50, 50, 300, 300);
        }
    }
    JTextField txt;

    STEP_10_GUI_5() {
        JFrame frame = new JFrame("GUI_10_4"); // gui의 틀인 frame 객체 생성

        JPanel panel = new MyPanel(); // frame 안에 들어가는 pannel 객체 생성

        txt = new JTextField("Click count : " + 0);
        txt.setBounds(100, 100, 200, 30);

        JButton btn_yes = new JButton("Yes");
        btn_yes.setBounds(150, 150, 80, 30);

        JButton btn_no = new JButton("No");
        btn_no.setBounds(150, 200, 80, 30);

        btn_yes.addActionListener(this);
        btn_no.addActionListener(this);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150, 300, 70, 30);
        btn_end.addActionListener(new ActionListener() {
            int i = 0;
            public void actionPerformed(ActionEvent e){
                System.exit(i);
            }
        });

        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.
        panel.add(txt); // panel에 txt 객체 추가
        panel.add(btn_yes); // panel에 btn_yes 객체 추가
        panel.add(btn_no); // panel에 btn_no 객체 추가
        panel.add(btn_end); // panel에 btn_end 객체 추가

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시
    }
    int nc1 = 0, nc2 = 0;
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Yes")){
            txt.setText("Yes Count : " + ++nc1);
        } else {
            txt.setText("No Count : " + ++nc1);
        }
    }
    public static void main(String[] args){
        STEP_10_GUI_5 main_obj = new STEP_10_GUI_5();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}