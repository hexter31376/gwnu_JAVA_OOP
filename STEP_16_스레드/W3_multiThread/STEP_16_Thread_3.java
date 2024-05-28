import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameThread {
    JFrame frame;
    JPanel panel, panel_other;
    JLabel lbl_ball;

    FrameThread (boolean flag, JLabel lbl_ball, int x, int y) {
        frame = new JFrame();

        panel = new JPanel();
        panel.setBackground(Color.white); // 패널의 배경색을 하얀색으로
        panel.setPreferredSize(new Dimension(400, 400)); // 패널의 크기를 2차원 400 * 400의 크기로
        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.

        this.lbl_ball = lbl_ball; // 매개변수로 받은 lbl_ball을 이 lbl_ball필드로

        JButton btn_snd = new JButton("Send"); // 전송 버튼 객체 생성
        btn_snd.setBounds(165, 300, 70, 30); // 버튼의 좌표와 크기 설정
        btn_snd.addActionListener(new ActionListener() { // btn_snd의 액션을 익명 클래스로 추가
            public void actionPerformed (ActionEvent e) { // 액션이 들어오면
                sendBall(); // sendBall 메소드 실행
            }
        });
        panel.add(btn_snd); // 전송 버튼 패널에 추가

        JButton btn_end = new JButton("End"); // 종료 버튼 객체화 및 초기값 설정
        btn_end.setBounds(165, 360, 70, 30); // 좌표 및 크기 설정
        btn_end.addActionListener(new ActionListener() { // 액션 리스너를 익명 클래스 생성과 동시에 정의
            public void actionPerformed(ActionEvent e){
                System.exit(0); // 프로그램 종료
            }
        });
        panel.add(btn_end); // 종료 버튼 패널에 추가

        if (flag) { // 플래그 값이 0이 아닌 값이면
            panel.add(lbl_ball); // lbl_ball 객체를 여기에 추가
        }

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시
    }

    private void sendBall () { // 공 이미지 객체를 다른 스레드 패널에 보내는 메소드
        panel.remove(lbl_ball); // 패널에서 lbl_ball 객체를 지우고
        panel.repaint(); // 패널 다시그리기
        panel_other.add(lbl_ball); // panel_other.repaint(); // 다른 패널에 lbl_ball 객체 생성
        panel_other.repaint(); // 패널 다시그리기
    }

    void setOtherPanel (JPanel panel) { // 현재 패널을 다른 패널로 설정하는 메소드
        panel_other = panel;
    }

    JPanel getPanel() { // 지금 이 패널을 리턴하는 메소드
        return (panel);
    }
}

public class STEP_16_Thread_3 {
    public static void main(String[] args) throws InterruptedException {
        ImageIcon img = new ImageIcon("Ball.jpg"); // 이미지 아이콘 불러오기
        JLabel lbl_ball = new JLabel(img); // 그 이미지를 라벨에 넣기
        lbl_ball.setBounds(175, 175, 50, 50); // 라벨의 위치와 크기 지정하기

        FrameThread frameTh_1 = new FrameThread(true, lbl_ball, 0, 0); // 아까 선언한 스레드 클래스 객체화하고 각각의 매개변수 초기값 설정
        FrameThread frameTh_2 = new FrameThread(false, lbl_ball, 0, 450); // 아까 선언한 스레드 클래스 객체화하고 각각의 매개변수 초기값 설정

        frameTh_1.setOtherPanel(frameTh_2.getPanel()); // 서로의 판넬을 알려주고 교환
        frameTh_2.setOtherPanel(frameTh_1.getPanel()); // 서로의 판넬을 알려주고 교환

        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}

// 이런 식으로 다중 스레드 구현이 가능하고, 스레드 간 상호작용이 가능하도록 프로그래밍이 가능합니다.

// 대략적으로 구조를 설명하자면

// 공이 있는 쪽이 panel, 없는 쪽이 panel_other입니다.
// 클래스 생성 후 서로의 클래스 객체 지시자를 바꿔가면서
// 보내고 받는 행위를 반복합니다.
// 즉 동작 스레드는 동일하나 지정하는 객체 포인터만 달라지는 것입니다.