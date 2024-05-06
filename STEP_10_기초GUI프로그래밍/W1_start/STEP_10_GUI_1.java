import java.awt.*; // 네이티브 gui 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지

public class STEP_10_GUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI_10_1"); // gui의 틀인 frame 객체 생성

        JPanel panel = new JPanel(); // frame 안에 들어가는 pannel 객체 생성
        panel.setBackground(Color.gray); // panel의 배경색을 gray로
        panel.setPreferredSize(new Dimension(400, 400)); // panel의 크기를 Dimension 객체를 새로 생성하고 그곳에 400, 400의 크기를 주고 매개변수로 넘기면서 생성

        JTextField txt = new JTextField("Click count : " + 0); // panel 안에 들어갈 txt 객체를 새로 생성하고 초기값 Click count : 문자열과 0 넣어주기
        txt.setBounds(100, 100, 200, 30); // txt 객체를 x:100, y:100 에 위치시키고 txt의 width:200 heght:30 으로 설정
        
        JButton btn_click = new JButton("Click"); // panel 안에 들어갈 btn_click 객체를 새로 생성하고 버튼의 글자를 Cilck으로 설정
        btn_click.setBounds(150, 200, 80, 30); // btn_click 객체를 x:150, y:200 에 위치시키고 txt의 width:80 heght:30 으로 설정

        JButton btn_end = new JButton("End"); // panel 안에 들어갈 btn_End 객체를 새로 생성하고 버튼의 글자를 End로 설정
        btn_end.setBounds(150, 300, 80, 30); // btn_End 객체를 x:150, y:300 에 위치시키고 txt의 width:80 heght:30 으로 설정

        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.
        panel.add(txt); // panel에 txt 객체 추가
        panel.add(btn_click); // panel에 btn_click 객체 추가
        panel.add(btn_end); // panel에 btn_end 객체 추가

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시

        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}