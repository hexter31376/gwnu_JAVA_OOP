import java.awt.*; // 네이티브 GUI 클래스 패키지
import java.awt.event.*; // 자바 이벤트 리스너 클래스 패키지
import javax.swing.*; // 자체 GUI 클래스 패키지

public class H1_Calculator_1 implements ActionListener {
    private char op; // 연산자
    private int n1, n2; // 정수 1, 정수 2
    private JTextField txt_input; // 입력 텍스트 필드
    private JTextField txt_total; // 결과 텍스트 필드
    private StringBuilder inputBuilder; // 입력을 저장하는 StringBuilder

    H1_Calculator_1(){
        JFrame frame = new JFrame(); // GUI의 틀인 frame 객체 생성
        JPanel panel = new JPanel(); // frame 안에 들어가는 panel 객체 생성

        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(400, 400));

        inputBuilder = new StringBuilder();

        JButton btn_1 = new JButton("1");
        btn_1.setBounds(124, 100, 40, 30);
        btn_1.addActionListener(this);

        JButton btn_2 = new JButton("2");
        btn_2.setBounds(180, 100, 40, 30);
        btn_2.addActionListener(this);

        JButton btn_3 = new JButton("3");
        btn_3.setBounds(236, 100, 40, 30);
        btn_3.addActionListener(this);

        JButton btn_plus = new JButton("+");
        btn_plus.setBounds(124, 150, 40, 30);
        btn_plus.addActionListener(this);

        JButton btn_minus = new JButton("-");
        btn_minus.setBounds(180, 150, 40, 30);
        btn_minus.addActionListener(this);

        JButton btn_equal = new JButton("=");
        btn_equal.setBounds(236, 150, 40, 30);
        btn_equal.addActionListener(this);

        txt_input = new JTextField();
        txt_input.setBounds(150, 200, 100, 30);

        txt_total = new JTextField();
        txt_total.setBounds(150, 250, 100, 30);

        panel.setLayout(null);
        panel.add(btn_1);
        panel.add(btn_2);
        panel.add(btn_3);
        panel.add(btn_plus);
        panel.add(btn_minus);
        panel.add(btn_equal);
        panel.add(txt_total);
        panel.add(txt_input);

        frame.getContentPane().add(panel); // frame의 컨텐츠 패널에 panel 추가
        frame.pack(); // frame의 크기를 컨텐츠에 맞게 자동으로 조정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 : 프로그램 종료
        frame.setVisible(true); // 프레임을 화면에 표시
    }

    public void actionPerformed(ActionEvent e){ // 액션이 감지될 때 작동하는 메서드
        String command = e.getActionCommand();
        
        if ("123".contains(command)) { // 숫자 버튼
            inputBuilder.append(command);
            txt_input.setText(inputBuilder.toString());
        } else if ("+-".contains(command)) { // 연산자 버튼
            n1 = Integer.parseInt(inputBuilder.toString());
            op = command.charAt(0);
            inputBuilder.setLength(0); // 입력 초기화
        } else if ("=".equals(command)) { // "=" 버튼
            n2 = Integer.parseInt(inputBuilder.toString());
            int result = 0;
            if (op == '+') {
                result = n1 + n2;
            } else if (op == '-') {
                result = n1 - n2;
            }
            txt_total.setText(String.valueOf(result));
            inputBuilder.setLength(0); // 입력 초기화
        }
    }

    public static void main(String[] args) {
        H1_Calculator_1 main_obj = new H1_Calculator_1();
        System.out.println("Console thread is going out !!!"); // GUI 시작을 알리는 콘솔 메세지
    }
}