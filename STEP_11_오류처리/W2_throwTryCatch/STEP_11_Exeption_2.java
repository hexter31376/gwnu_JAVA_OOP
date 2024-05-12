import java.io.*; // 자바 입출력을 위한 io패키지 내 모든 클래스를 import 해온다.

class MyRndException_21 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}
class MyRndException_22 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}

class Get_n_2 { // 난수 생성 0이면 오류를 반환하고 그렇지 않으면 임의로 생성된 난수를 반환하는 함수
    int getnum(){
        int n; // 난수를 받아줄 n 선언
        
        try { // 예외를 처리할 구문을 try문 안에 넣고
            n = (int)(Math.random() * 10); // 0에서 9까지의 난수를 반환하고 n에 저장
            System.out.println(n); // n 반환
            if (n == 0){ // n이 0이면
                throw new MyRndException_21(); // if 조건문에 따라 MyRndException_21을 throw하기
            }
        } catch(MyRndException_21 e) { // throw한 예외를 받아줄 catch 문 작성
            System.out.println("MyRndException_21"); // catch 했을때 할 행동인 MyRndException_21 출력하기
            return -1; // -1 즉 오류 리턴하기
        }
        return (n); // n을 리턴한다.

    }
}

class Get_m_2 { // get_n_1형 객체를 객체 지시자로 받아들여 추가로 모듈러 연산 값이 연산일때 오류 처리를 위한 클래스
    Get_n_2 gn; // Get_n_1형 클래스를 받아들일 수 있는 객체 지시자 gn선언

    Get_m_2(Get_n_2 gn){ // 객체 생성자의 파라미터로 Get_n_1형 객체 gn을 받아들인다.
        this.gn = gn; // 그 객체의 주소를 이 클래스의 필드에 저장
    }

    int getmod(){ // 모듈러 연산을 추가로 진행하여 그 결과값이 0이면 오류 반환, 아니면 그 값 반환하는 메소드 선언
        int x, y, m; // gn의 리턴값을 받아줄 x와 y를 선언하고 그 둘을 모듈러 연산한 결과를 저장할 m선언

        try { // 예외가 발생할 것 같은 구문을 try문 안에 넣고
            if((x = gn.getnum()) < 0 || (y = gn.getnum()) < 0 || (m = (x % y)) == 0){
                // 객체화된 gn 객체로 getnum메소드를 실행시키고 x에 저장한다음 그 x값이 0 이하이면 혹은
                // 객체화된 gn 객체로 getnum메소드를 실행시키고 y에 저장한다음 그 y값이 0 이하이면 혹은
                // 그렇게 나온 결과값의 모듈러 연산 값이 0이면(둘다 0이 아닐때는 그 값을 반환하므로)
                throw new MyRndException_22(); // if 조건문에 따라 MyRndException_21을 throw하기
            }
        } catch(MyRndException_22 e) { // throw한 예외를 받아줄 catch 문 작성
            System.out.println("MyRndException_22"); // catch 했을때 할 행동인 MyRndException_21 출력하기
            return -1; // -1 즉 오류 리턴하기
        }
        System.out.printf("<%d %d>", x, y); // x와 y값 출력
        return (m); // m반환
    }
}

class STEP_11_Exeption_2 {
    public static void main(String[] args) {
        Get_n_2 rd = new Get_n_2(); // Get_n_2 를 객체화시키고 그 값을 rd에 저장
        Get_m_2 md = new Get_m_2(rd); // Get_m_2 를 객체화시키고 객체 생성자에 rd를 넘겨주고 그 값을 md에 저장
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

// 자바에서는 try catch문을 통한 예외 처리를 지원합니다.
// 구현 순서로는
// 1. Exception클래스를 상속받은 커스텀 예외를 만들고(물론 기본 예외도 받을 수 있습니다)
// 2. 메소드에서 예외 처리를 할 구문을 try 문에 집어넣고
// 3. if문을 통해 예외 상황일 경우 그에 맞는 Exception을 객체화해서 throw해주고
// 4. 이때 throw해준 객체는 반드시 catch를 해 주어서 그에 따른 행동을 정의해야 합니다.