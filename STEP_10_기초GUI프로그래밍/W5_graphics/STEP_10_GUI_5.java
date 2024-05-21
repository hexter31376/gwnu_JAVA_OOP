import java.awt.*; // 네이티브 gui 클래스 패키지
import java.awt.event.*; // 자바 이벤트리스너 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지

public class STEP_10_GUI_5 {
    STEP_10_GUI_5() throws InterruptedException {
        JFrame frame = new JFrame("GUI_10_5"); // gui의 틀인 frame 객체 생성
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
        STEP_10_GUI_5 main_obj = new STEP_10_GUI_5();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}