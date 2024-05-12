import java.io.*; // 자바 입출력을 위한 io패키지 내 모든 클래스를 import 해온다.

class MyRndException_81 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}
class MyModException_82 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}

class Get_n_8 { // 난수 생성 0이면 오류를 throw하고 그렇지 않으면 임의로 생성된 난수를 반환하는 함수
    int getnum() throws MyRndException_81{ // throw로 여기서 발생한 예외를 throw해주어야 합니다.
        int n; // 난수를 받아줄 n 선언

        n = (int)(Math.random() * 10); // 0에서 9까지의 난수를 반환하고 n에 저장
        System.out.println(n); // n 반환
        if (n == 0){ // n이 0이면
            throw new MyRndException_81(); // if 조건문에 따라 MyRndException_81을 throw하기
        }
        return (n); // n을 리턴한다.
    }
}

class Get_m_8 { // get_n_8형 객체를 객체 지시자로 받아들여 추가로 모듈러 연산 값이 연산일때 오류 처리를 위한 클래스
    Get_n_8 gn; // Get_n_8형 클래스를 받아들일 수 있는 객체 지시자 gn선언

    Get_m_8(Get_n_8 gn){ // 객체 생성자의 파라미터로 Get_n_8형 객체 gn을 받아들인다.
        this.gn = gn; // 그 객체의 주소를 이 클래스의 필드에 저장
    }

    int getmod() throws MyRndException_81, MyModException_82{ // throw로 이전 메소드로부터 받은 예외와 여기서 발생한 예외를 throw해주어야 합니다.
        int x, y, m; // gn의 리턴값을 받아줄 x와 y를 선언하고 그 둘을 모듈러 연산한 결과를 저장할 m선언

        x = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 x에 저장
        y = gn.getnum(); // 객체화 gn의 getnum 메소드 실행하고 그 값을 y에 저장

        if((m = (x % y)) == 0){ // m x와 y를 모듈러 연산한 결과가 0이면
            throw new MyModException_82(); // 예외 throw하기
        }
        System.out.printf("<%d %d>", x, y); // x와 y값 출력
        return (m); // m반환
    }
}

class STEP_11_Exception_8 {
    public static void main(String[] args) {  // 이 메인 메소드에서 모든 예외를 처리합니다. 여기서도 throw해주면 기본 예외를 제외하고는 오류가 납니다.
        Get_n_8 rd = new Get_n_8(); // Get_n_8 를 객체화시키고 그 값을 rd에 저장
        Get_m_8 md = new Get_m_8(rd); // Get_m_8 를 객체화시키고 객체 생성자에 rd를 넘겨주고 그 값을 md에 저장
        int m = 0, i, flag = 0; // 리턴받은 값을 저장할 m, 반복문 변수 i, mod값을 얻는 중이라는 표시를 표현할 flag 변수 선언

        for(i = 0; i < 3; i++){ // 3번 반복
            flag = 1; // 파일이 열려있음을 표시할 flag값

            try { // throw한 예외를 여기서 넘겨받습니다.
                m = md.getmod(); // 분기처리 없이 일단 메소드 호출 및 처리를 할 수 있습니다 예외는 try catch에서 알아서 받아줍니다.
            } catch(MyRndException_81 e) { // 일단 모든 예외를 catch합니다.
                System.out.println("MyRndException_81"); // 해당 예외가 발생했음을 출력
                break; // 반복문 종료
            } catch (MyModException_82 e){
                System.out.println("MyModException_82"); // 해당 예외가 발생했음을 출력
                break; // 반복문 종료
            } finally { // finally 추가
                flag = 0; // 파일이 닫혀있음을 표시할 flag값
                System.out.println("-->" + m); // m 출력하기
            }
        }
        System.out.println("Stop..."); // 예외 발생을 알리는 stop 출력
    }
}

// flag문이 실제 그 기능을 하진 않지만 flag문이 파일이 열려있는 상태와 닫혀있는 상태를 0과 1로 표현하는 필드라고 가정하겠습니다.
// 위 반복문에서는 파일을 열고, mod연산을 하고 파일을 닫고 위 과정을 반복합니다
// 하지만 예외를 발견하면 예외 처리후 break를 해버리므로 flag를 0으로 바꾸는 과정과, 값 출력을 생략합니다.
// flag가 파일이 열려있는 상태라고 가졍했을때 finally 없이 생으로 처리해버리면 작업 내용을 잃어버리는 끔찍한 상황이 발생할 수 있습니다.

// 하지만 finally를 다음과 같이 추가하면 finally는 break를 하던 return을 하던 finally 문을 반드시 실행한 후 원래 명령을 수행합니다.
// 따라서 flag = 0을 수행하고 종료 하므로 파일 내용의 손상을 막을 수 있습니다.