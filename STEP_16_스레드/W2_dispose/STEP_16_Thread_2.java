import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_16_Thread_2 {
    STEP_16_Thread_2 () throws InterruptedException {
        final int Up = 0, Dn = 1, Rt = 2, Lt = 3;
        int cx = 200 - 50, cy = 200 - 50, px = cx, py = cy;

        JFrame frame = new JFrame(); // gui의 틀인 frame 객체 생성
        JPanel panel = new JPanel(); // frame 안에 들어가는 pannel 객체 생성

        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(400, 400));

        JButton btn_end = new JButton("End"); // 종료 버튼 객체화 및 초기값 설정
        btn_end.setBounds(165, 360, 70, 30); // 좌표 및 크기 설정
        btn_end.addActionListener(new ActionListener() { // 액션 리스너를 익명 클래스 생성과 동시에 정의
            public void actionPerformed(ActionEvent e){
                frame.dispose(); // System.exit(0); // 이 '스레드'를 종료
            }
        });

        ImageIcon img = new ImageIcon("Ball.jpg");
        JLabel lbl_ball = new JLabel(img);
        lbl_ball.setBounds(cx, cy, 50, 50);

        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.
        panel.add(btn_end); // panel에 btn_end 객체 추가
        panel.add(lbl_ball);

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시

        while(true) {
            int ewsn, disp;
            ewsn = (int)(Math.random() * 1000) % 4;
            disp = (int)(Math.random() * 1000) % 30;

            switch (ewsn) {
                case Up:
                    cy -= disp;
                    if(cy < 0){
                        cy = 0;
                    }
                    break;
                case Dn:
                    cy += disp;
                    if(360 - 50 < cy){
                        cy = 360 - 50;
                    }
                    break;
                case Lt:
                    cx -= disp;
                    if(cx < 0){
                        cx = 0;
                    }
                    break;
                case Rt:
                    cx += disp;
                    if(400 - 50 < cx){
                        cx = 400 - 50;
                    }
                    break;
                default:
                    break;
            }
            lbl_ball.setLocation(cx, cy);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        STEP_16_Thread_2 main_obj = new STEP_16_Thread_2();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}

// 사실 MyPanel만 정의 안했지 STEP_10_GUI_7과 다를 바가 없습니다.
// 하지만 한가지 차이가 있다면 end 버튼의 종료를 exit()가 아닌 dispose() 메소드를 통해 진행해 주었는데,
// 이를 통해 JFrame'스레드' 만 종료가 되고 메인 메소드 스레드는 그대로 실행하고 있는 모습을 볼 수 있습니다.

// 메인 스레드는 Ctrl + C 키로 종료가 가능합니다.