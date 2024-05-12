import java.io.*; // 자바 입출력을 위한 io패키지 내 모든 클래스를 import 해온다.

class MyRndException_51 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}
class MyModException_52 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}

class Get_n_5 { // 난수 생성 0이면 오류를 throw하고 그렇지 않으면 임의로 생성된 난수를 반환하는 함수
    int getnum() throws MyRndException_51{ // throw로 여기서 발생한 예외를 throw해주어야 합니다.
        int n; // 난수를 받아줄 n 선언

        n = (int)(Math.random() * 10); // 0에서 9까지의 난수를 반환하고 n에 저장
        System.out.println(n); // n 반환
        if (n == 0){ // n이 0이면
            throw new MyRndException_51(); // if 조건문에 따라 MyRndException_51을 throw하기
        }
        return (n); // n을 리턴한다.
    }
}

class Get_m_5 { // get_n_5형 객체를 객체 지시자로 받아들여 추가로 모듈러 연산 값이 연산일때 오류 처리를 위한 클래스
    Get_n_5 gn; // Get_n_5형 클래스를 받아들일 수 있는 객체 지시자 gn선언

    Get_m_5(Get_n_5 gn){ // 객체 생성자의 파라미터로 Get_n_5형 객체 gn을 받아들인다.
        this.gn = gn; // 그 객체의 주소를 이 클래스의 필드에 저장
    }

    int getmod() throws MyRndException_51, MyModException_52{ // throw로 이전 메소드로부터 받은 예외와 여기서 발생한 예외를 throw해주어야 합니다.
        int x, y, m; // gn의 리턴값을 받아줄 x와 y를 선언하고 그 둘을 모듈러 연산한 결과를 저장할 m선언

        x = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 x에 저장
        y = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 y에 저장

        if((m = (x % y)) == 0){ // m x와 y를 모듈러 연산한 결과가 0이면
            throw new MyModException_52(); // 예외 throw하기
        }
        System.out.printf("<%d %d>", x, y); // x와 y값 출력
        return (m); // m반환
    }
}

class STEP_11_Exception_5 {
    public static void main(String[] args) {  // 이 메인 메소드에서 모든 예외를 처리합니다. 여기서도 throw해주면 기본 예외를 제외하고는 오류가 납니다.
        Get_n_5 rd = new Get_n_5(); // Get_n_5 를 객체화시키고 그 값을 rd에 저장
        Get_m_5 md = new Get_m_5(rd); // Get_m_5 를 객체화시키고 객체 생성자에 rd를 넘겨주고 그 값을 md에 저장
        int m; // 리턴받은 값을 저장할 m 선언

        while(true){ // 무한 반복
            try { // throw한 예외를 여기서 넘겨받습니다.
                m = md.getmod(); // 분기처리 없이 일단 메소드 호출 및 처리를 할 수 있습니다 예외는 try catch에서 알아서 받아줍니다.
            } catch(Exception e) { // 일단 모든 예외를 catch합니다.
                if(e.toString().equals("MyRndException_51")){ // 식별된 예외 클래스 이름이 MyRndException_51면
                    System.out.println("MyRndException_51"); // 해당 예외가 발생했음을 출력
                } else if(e.toString().equals("MyModException_52")){ // 식별된 예외 클래스 이름이 MyModException_52면
                    System.out.println("MyModException_52"); // 해당 예외가 발생했음을 출력
                }
                break; // 반복문 종료
            }
            System.out.println("-->" + m); // m 출력하기
        }
        System.out.println("Stop..."); // 예외 발생을 알리는 stop 출력
    }
}

// 다형성을 여기서도 적용할 수 있는데 Exception을 모두 받아들이고 그 Exeption의 이름에 따라 어떤 예외인지를 if문으로 처리합니다
// 자식 클래스에 포함된 부모 클래스를 이용하는 다형성의 예시라고 볼 수 있습니다.