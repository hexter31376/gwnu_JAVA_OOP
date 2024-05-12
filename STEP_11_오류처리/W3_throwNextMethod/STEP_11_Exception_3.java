import java.io.*; // 자바 입출력을 위한 io패키지 내 모든 클래스를 import 해온다.

class MyRndException_31 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}
class MyModException_32 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}

class Get_n_3 { // 난수 생성 0이면 오류를 throw하고 그렇지 않으면 임의로 생성된 난수를 반환하는 함수
    int getnum() throws MyRndException_31{ // 이때 발생한 예외는 throw 해주어야 합니다.
        int n; // 난수를 받아줄 n 선언

        n = (int)(Math.random() * 10); // 0에서 9까지의 난수를 반환하고 n에 저장
        System.out.println(n); // n 반환
        if (n == 0){ // n이 0이면
            throw new MyRndException_31(); // if 조건문에 따라 MyRndException_31을 throw하기
        }
        return (n); // n을 리턴한다.
    }
}

class Get_m_3 { // get_n_3형 객체를 객체 지시자로 받아들여 추가로 모듈러 연산 값이 연산일때 오류 처리를 위한 클래스
    Get_n_3 gn; // Get_n_3형 클래스를 받아들일 수 있는 객체 지시자 gn선언

    Get_m_3(Get_n_3 gn){ // 객체 생성자의 파라미터로 Get_n_4형 객체 gn을 받아들인다.
        this.gn = gn; // 그 객체의 주소를 이 클래스의 필드에 저장
    }

    int getmod() throws MyRndException_31{ // throw로 이전 메소드로부터 받은 예외를 throw해주어야 합니다.
        int x, y, m; // gn의 리턴값을 받아줄 x와 y를 선언하고 그 둘을 모듈러 연산한 결과를 저장할 m선언

        try { // 예외가 발생할 것 같은 구문을 try문 안에 넣고
            x = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 x에 저장
            y = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 y에 저장
            if((m = (x % y)) == 0){ // m x와 y를 모듈러 연산한 결과가 0이면
                throw new MyModException_32(); // 예외 throw하기
            }
        } catch(MyModException_32 e) { // throw한 예외를 받아줄 catch 문 작성
            System.out.println("MyModException_32"); // catch 했을때 할 행동인 MyModException_32 출력하기
            return -1; // -1 즉 오류 리턴하기
        }
        System.out.printf("<%d %d>", x, y); // x와 y값 출력
        return (m); // m반환
    }
}

class STEP_11_Exception_3 {
    public static void main(String[] args) { // 이 메인 메소드에서 모든 예외를 처리합니다. 여기서도 throw해주면 기본 예외를 제외하고는 오류가 납니다.
        Get_n_3 rd = new Get_n_3(); // Get_n_3 를 객체화시키고 그 값을 rd에 저장
        Get_m_3 md = new Get_m_3(rd); // Get_m_3 를 객체화시키고 객체 생성자에 rd를 넘겨주고 그 값을 md에 저장
        int m; // 리턴받은 값을 저장할 m 선언

        while(true){ // 무한 반복
            try { // throw한 예외를 여기서 넘겨받을수도 있습니다.
                if((m = md.getmod()) < 0){ // getmod의 값이 0보다 작으면(리턴 값이 -1이면)
                    break; // 반복문 탈출
                }
            } catch(MyRndException_31 e) { // throw한 예외에 대한 catch를 여기서 처리합니다.
                System.out.println("MyRndException_31"); // 해당 예외가 발생했음을 출력
                break; // 반복문 출력
            }
            System.out.println("-->" + m); // m 출력하기
        }
        System.out.println("Stop..."); // 예외 발생을 알리는 stop 출력
    }
}

// 메소드에서 발생한 예외를 꼭 그 메소드에서 받아줄 필요는 없습니다.
// 그 메소드를 호출하는 다음 메소드로 넘겨줄 수 있는데 이때 메소드에 throws로 어떤 예외를 throw 해줄지를 명시해주어야 합니다.
// throw로 계속 넘겨줄 수 있는데 이때 어딘가에서는 반드시 try catch로 받아주어야 합니다.