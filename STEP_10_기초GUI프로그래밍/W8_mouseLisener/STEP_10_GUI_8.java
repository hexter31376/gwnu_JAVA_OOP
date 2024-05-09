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
        int x = e.getX(); // 원래 위치에서 얼마나 움직였는가를 측정하기 위한 x좌표값
        int y = e.getY(); // 원래 위치에서 얼마나 움직였는가를 측정하기 위한 y좌표값

        Component cp = (Component)e.getSource(); // 원본에 대한 컴포넌트를 얻어서
        cp.setLocation(x + cp.getX() - 25, y + cp.getY() - 25); // 원본 좌표에 이동한 좌표 더해주고 그것을 위치로 결정
        System.out.printf("x = %d, y = %d\n", x, y); // 마우스와 이미지 좌표 차 출력
    }
}

public class STEP_10_GUI_8 {
    STEP_10_GUI_8(){
        MyMouseListener mymlsnr = new MyMouseListener(); // 마우스리스너형 객체 지시자 mymlsnr 생성
        JFrame frame = new JFrame(); // gui의 틀인 frame 객체 생성
        JPanel panel = new JPanel(); // frame 안에 들어가는 pannel 객체 생성

        panel.setBackground(Color.white); // 
        panel.setPreferredSize(new Dimension(400, 400));

        JButton btn_end = new JButton("End");
        btn_end.setBounds(165, 360, 70, 30);
        btn_end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        ImageIcon img = new ImageIcon("Img.jpg");
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
