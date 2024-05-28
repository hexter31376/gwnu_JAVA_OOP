import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_16_Thread_1 implements ActionListener{
    class MyPanel extends JPanel { // jpanel을 상속받은 새로운 mypanel 선언
        MyPanel () { // 객체 생성자 내용 추가
            setBackground(Color.gray); // 백그라운드 색깔을 회색으로
            setPreferredSize(new Dimension(400, 400)); // 패널 사이즈는 400 * 400
        }
        public void paintComponent (Graphics g) { // paintComponent 메소드를 정의하고 Grapihics 형 g를 매개변수로
            g.setColor(Color.red); // 그리기 컴포넌트의 색깔 정의
            g.drawRect(50, 50, 300, 300); // 사각형 그리기 좌표와 크기 정의
        }
    }

    JTextField txt; // textfield 필드 정의

    STEP_16_Thread_1() {
        JFrame frame = new JFrame(); // gui의 틀인 frame 객체 생성
        JPanel panel = new MyPanel(); // frame 안에 들어가는 pannel 객체 생성

        txt = new JTextField("Click count : " + 0); // 텍스트 필드 객체화 및 초기값 설정
        txt.setBounds(100, 100, 200, 30); // 좌표 및 크기 설정

        JButton btn_yes = new JButton("Yes"); // yes 버튼 객체화 및 초기값 설정
        btn_yes.setBounds(150, 150, 80, 30); // 좌표 및 크기 설정

        JButton btn_no = new JButton("No"); // no 버튼 객체화 및 초기값 설정
        btn_no.setBounds(150, 200, 80, 30); // 좌표 및 크기 설정

        btn_yes.addActionListener(this); // 지금 이 클래스의 액션 리스너를 버튼에 집어넣기
        btn_no.addActionListener(this); // 지금 이 클래스의 액션 리스너를 버튼에 집어넣기

        JButton btn_end = new JButton("End"); // 종료 버튼 객체화 및 초기값 설정
        btn_end.setBounds(150, 300, 70, 30); // 좌표 및 크기 설정
        btn_end.addActionListener(new ActionListener() { // 액션 리스너를 익명 클래스 생성과 동시에 정의
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

    int nc1 = 0, nc2 = 0; // yes count와 no count를 저장할 변수 선언

    public void actionPerformed(ActionEvent e){ // 액션리스너가 이벤트 감지시 할 행동의 정의, 행동은 ActionEvent
        if(e.getActionCommand().equals("Yes")){ // 액션을 읽어오는데 읽어온 액션의 버튼 이름이 Yes와 같다면
            txt.setText("Yes Count : " + ++nc1); // Yes 카운트 증가
        } else { // Yes가 아니면
            txt.setText("No Count : " + ++nc1); // No 카운트 증가
        }
    }

    public static void main(String[] args) {
        STEP_16_Thread_1 main_obj = new STEP_16_Thread_1();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}

// 사실 STEP_10_QUI_5 메소드 그냥 그 자체입니다
// 여기서 핵심으로 볼 사항은 메인 함수가 JFrame 객체를 생성하고 종료했지만,
// 전체 프로그램이 끝나지 않고 계속 실행 중인 것에 있습니다.

// 즉 STEP_16_Thread_1으로 생성된 프레임이 메인 실행 줄기에서 독립해 새로운 실행 줄기를 만들어 내었고,

// 이렇게 독립적인 실행 줄기를 스레드라 부르게 됩니다.

// 프로그램 (프로세스)(main)과 스레드(JFrame 객체)를 구분하여야 합니다.
// 프로그래밍을 어떻게 하느냐에 따라 여러개의 스레드를 만들 수 있으며
// 하나의 스레드라도 남아있다면 프로그램은 종료하지 않습니다.

// System.exit() 메소드는 프로그램을 종료시키므로 모든 스레드도 같이 종료됩니다.