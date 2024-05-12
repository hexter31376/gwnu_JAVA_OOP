import java.io.*; // 표준 출력 스트림 사용을 위한 io패키지 import

class Get_n_1 { // 난수 생성 0이면 오류를 반환하고 그렇지 않으면 임의로 생성된 난수를 반환하는 함수
    int getnum(){
        int n = (int)(Math.random() * 10); // 0에서 9까지의 난수를 반환하고 n에 저장
        System.out.println(n); // n 반환
        if (n == 0){ // n이 0이면
            return -1; // -1 반환 (-1은 보통 오류를 의미한다)
        } else { // n이 나머지 숫자이면
            return (n); // n 반환
        }
    }
}

class Get_m_1 { // get_n_1형 객체를 객체 지시자로 받아들여 추가로 모듈러 연산 값이 연산일때 오류 처리를 위한 클래스
    Get_n_1 gn; // Get_n_1형 클래스를 받아들일 수 있는 객체 지시자 gn선언

    Get_m_1(Get_n_1 gn){ // 객체 생성자의 파라미터로 Get_n_1형 객체 gn을 받아들인다.
        this.gn = gn; // 그 객체의 주소를 이 클래스의 필드에 저장
    }

    int getmod(){ // 모듈러 연산을 추가로 진행하여 그 결과값이 0이면 오류 반환, 아니면 그 값 반환하는 메소드 선언
        int x, y, m; // gn의 리턴값을 받아줄 x와 y를 선언하고 그 둘을 모듈러 연산한 결과를 저장할 m선언
        if((x = gn.getnum()) < 0 || (y = gn.getnum()) < 0 || (m = (x % y)) == 0){
            // 객체화된 gn 객체로 getnum메소드를 실행시키고 x에 저장한다음 그 x값이 0 이하이면 혹은
            // 객체화된 gn 객체로 getnum메소드를 실행시키고 y에 저장한다음 그 y값이 0 이하이면 혹은
            // 그렇게 나온 결과값의 모듈러 연산 값이 0이면(둘다 0이 아닐때는 그 값을 반환하므로)
            return -1; // -1 반환
        }
        System.out.printf("<%d %d>", x, y); // x와 y값 출력
        return (m); // n반환
    }
}
class STEP_11_Exeption_1 {
    public static void main(String[] args) {
        Get_n_1 rd = new Get_n_1(); // Get_n_1 을 객체화시키고 그 값을 rd에 저장
        Get_m_1 md = new Get_m_1(rd); // Get_m_1 을 객체화시키고 객체 생성자에 rd를 넘겨주고 그 값을 md에 저장
        int m; // 리턴받은 값을 저장할 m 선언

        while(true){ // 무한 반복
            if((m = md.getmod()) < 0){ // getmod의 값이 0보다 작으면(리턴 값이 -1이면)
                break; // 반복문 탈출
            }
            System.out.println("-->" + m); // m 출력하기
        }
        System.out.println("Stop..."); // 예외 발생을 알리는 stop 출력
    }
}

// c언어에서는 이런 식으로 예외에 따른 리턴 값을 정해놓고 그 리턴값을 분석하는 식으로 예외 처리를 진행한다
// 이런 식으로 하면 메소드별로 리턴 값을 분석해야 하고 리턴 값 체크를 게을리 하면 프로그램이 정상 동작하지 않습니다.
// 그러면 어디서 문제가 발생한 것인지 디버깅을 해야 하고 개발 생산성 저하로 이어집니다.