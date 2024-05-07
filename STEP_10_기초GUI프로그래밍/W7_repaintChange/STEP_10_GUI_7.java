import java.awt.*; // 네이티브 gui 클래스 패키지
import java.awt.event.*; // 자바 이벤트리스너 클래스 패키지
import javax.swing.*; // 자체 gui 클래스 패키지

class STEP_10_GUI_7 {
    STEP_10_GUI_7() throws InterruptedException {
        final int Up = 0, Dn = 1, Rt = 2, Lt = 3;
        int cx = 200 - 50, cy = 200 - 50, px, py = cy;

        JFrame frame = new JFrame("GUI_10_7");
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
        STEP_10_GUI_7 main_obj = new STEP_10_GUI_7();
        System.out.println("Console thread is going out !!!"); // gui 시작을 알리는 콘솔 메세지
    }
}
