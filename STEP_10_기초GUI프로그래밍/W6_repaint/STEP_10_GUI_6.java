import java.awt.*; // 네이티브 gui 클래스 패키지
import java.awt.event.*; // 자바 이벤트리스너 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지


class MyPanel extends JPanel { // MyPanel 클래스로 JPanel 클래스를 상속받아서 재정의 합니다.
    final int Up = 0, Dn = 1, Rt =2 , Lt = 3; // final 옵션으로 필드에 상수 옵션을 주고 위 아래 오른쪽 왼쪽 변수에 0부터 3까지의 상수 삽입
    private int x = 200 - 50, y = 200 - 50; // 그려질 원의 좌표가 중앙에서 시작하도록 전체 크기의 중앙 - 원의 크기의 초기 좌표 부여
    MyPanel(){ // 객체 생성자로
        setBackground(Color.white); // 패널의 배경색을 하얀색으로
        setPreferredSize(new Dimension(400, 400)); // 패널의 가로세로 크기는 400 * 400
    }
    public void paintComponent(Graphics g){ // 그려지는 컴포넌트의 설정을 합니다. 그려지는 객체 지시자를 매개변수로 받습니다.
        super.paintComponent(g); // 부모 클래스의 paintComponet에 g를 넣어줍니다 반드시 그래픽 작업시 먼저 호출해야 하며 이전 그림을 지우고 새로 그려주는 역할을 합니다.
        g.setColor(Color.red); // 그래픽 컴포넌트의 테두리 색을 빨간색으로 설정합니다.
        g.drawOval(x, y, 50, 50); // 타원을 그릴 것을 알리는 메소드이고 초기 위치와 원의 가로세로 크기를 매개변수로 받습니다.
    }
    public void move_circle(){ // 원을 이동시키는 로직 메소드
        int ewsn = (int)(Math.random() * 1000) % 4; // E, W, S, N 이 4개중의 하나가 되도록 합니다.
        int disp = (int)(Math.random() * 1000) % 30; // 이동 거리는 30을 넘어가지 않도록 합니다.

        switch (ewsn) { // 이동 방향과 좌표 설정 스위치문 로직
            case Up: // 랜덤 넘버가 0이면
                y = y;
                y -= disp; // 현재 y좌표에서 이동거리를 뺍니다.
                if(y < 0){ // 만약 y가 0보다 작다면
                    y = 0; // 0으로 만들어줍니다.
                }
                break; // 스위치 문을 탈출합니다.
            case Dn: // 랜덤 넘버가 1이면
                y = y;
                y += disp; // 현재 y좌표에서 이동거리를 더해줍니다.
                if(350-50 < y){ // 만약 y가 300 보다 크다면
                    y = 350-50; // y를 범위 내로 만들어줍니다.
                }
                break; // 스위치 문을 탈출합니다.
            case Rt: // 랜덤 넘버가 2면
                x = x;
                x += disp; // 현재 x좌표에서 이동거리를 더해줍니다.
                if(400-50 < x){ // 만약 x가 300 보다 크다면
                    x = 400-50; // x를 범위 내로 만들어줍니다.
                }
                break; // 스위치 문을 탈출합니다.
            case Lt: // 랜덤 넘버가 3이면
                x = x;
                x -= disp; // 현재 x좌표에서 이동거리를 뺍니다.
                if(x < 0){ // 만약 x가 0보다 작다면
                    x = 0; // 0으로 만들어줍니다.
                }
                break; // 스위치 문을 탈출합니다.
        }
        repaint(); // 다시 그리기 메소드를 호출합니다.
    }
}
public class STEP_10_GUI_6 {
    STEP_10_GUI_6() throws InterruptedException {
        JFrame frame = new JFrame(); // gui의 틀인 frame 객체 생성
        //JPanel panel = new Mypanel(); // 다형성
        MyPanel panel = new MyPanel(); // frame 안에 들어가는 MyPanel 객체 생성
        JButton btn_end = new JButton("End"); // panel 안에 들어갈 btn_End 객체를 새로 생성하고 버튼의 글자를 End로 설정

        btn_end.setBounds(165, 360, 70, 30); // btn_End 객체를 x:165, y:360 에 위치시키고 txt의 width:70 heght:30 으로 설정
        btn_end.addActionListener(new ActionListener(){ // btn_end에 액션리스너를 추가하는 메소드를 호출하고 그 매개변수로 새로운 액션 리스너를 넘겨주는데 이때 메소드 재정의를 통해 액션퍼폼드 메소드를 exit로 재정의했습니다.
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.
        panel.add(btn_end); // panel에 btn_end 객체 추가

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시
        while(true){
            Thread.sleep(100); // ms 단위로 프로그램을 잠시 쉽니다.
            panel.move_circle(); // 아까 만들어준 원 다시그리기 메소드를 호출합니다.
        }
    }
    public static void main(String[] args) throws InterruptedException {
        STEP_10_GUI_6 main_obj = new STEP_10_GUI_6();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}