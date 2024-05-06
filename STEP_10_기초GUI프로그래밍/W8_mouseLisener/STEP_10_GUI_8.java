import java.awt.*; // 네이티브 gui 클래스 패키지
import java.awt.event.*; // 자바 이벤트리스너 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지

class MyMouseListener implements MouseListener, MouseMotionListener {
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}

    public void mouseDragged(MouseEvent e){ // 마우스 드래그되었을때의 메소드 동작 정의
        int x = e.getX();
        int y = e.getY();

        Component cp = (Component)e.getSource();
        cp.setLocation(x + cp.getX() - 25, y + cp.getY() - 25);
        System.out.printf("x = %d, y = %d\n", x, y);
    }
}

public class STEP_10_GUI_8 {
    STEP_10_GUI_8(){
        MyMouseListener mymlsnr = new MyMouseListener();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(400, 400));

        JButton btn_end = new JButton("End");
        btn_end.setBounds(165, 360, 70, 30);
        btn_end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        ImageIcon img = new ImageIcon("보노보노.jpeg");
        if(img == null){
            System.out.println("Image not found");
            System.exit(1);
        }
        JLabel lbl_ball = new JLabel(img);
        lbl_ball.setBounds(150, 150, 70, 70);
        lbl_ball.addMouseListener(mymlsnr);
        lbl_ball.addMouseMotionListener(mymlsnr);

        panel.setLayout(null); // 요소의 자동 배치를 막고 개발자가 직접 컴포넌트의 크기와 위치를 정할 수 있게 한다.
        panel.add(btn_end); // panel에 btn_end 객체 추가
        panel.add(lbl_ball);

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시
    }

    public static void main(String[] args) {
        STEP_10_GUI_8 main_obj = new STEP_10_GUI_8();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }

}
