import java.io.*;

class MyIOException_91 extends Exception { // 커스텀 예외를 Exception 클래스를 상속하여 정의한다.
}

class Get_n_9 {
    int getnum() throws MyIOException_91, IOException{
        int n; // 사용자에게 값을 입력받을 변수 n 선언

        while(true) { // 무한 반복
            n = System.in.read(); // System.in.read는 사용시 IOException을 반드시 해 주어야 한다
            if(n == '\n'){ // 개행 문자를 받으면
                continue; // 위 구문을 건너뛰고 계속 진행(System.in.read()는 아스키 문자 하나씩 받으므로 개행 문자도 받는데 이때의 강제 입력 종료를 막기 위함)
            }
            if(n < '0' || n > '9'){ // n이 0보다 작거나 9보다 크면
                throw new MyIOException_91(); // 커스텀 예외 반환
            }
            return(n - '0'); // n을 정수화시키고 반환
        }
    }
}

class Get_m_9 {
    Get_n_9 gn; //  Get_n_9형 객체 지시자 gn 선언

    Get_m_9(Get_n_9 gn) { // 객체 생성자 정의 및  Get_n_9형 객체를 파라미터로 받는다
        this.gn = gn; // 입력받은 객체를 gn이 가리키게 한다
    }
    int getmod() throws MyIOException_91, IOException{ // 모듈러 연산을 한 결과를 출력하는 메소드 정의
        int x, y, m; // 값을 입력받을 x, y 변수와 그 둘의 모듈러 연산 값을 저장하는 변수 m을 선언

        x = gn.getnum(); // 객체 gn의 getnum 호출
        y = gn.getnum(); // 객체 gn의 getnum 호출
        m = (x % y); // 모듈러 연산하고 m에 저장
        System.out.printf("<%d, %d>", x, y); // 모듈러 연산의 원소들 출력
        return (m); // 모듈러 연산의 결과 반환
    }
}

class STEP_11_Exception_9 {
    public static void main(String[] args) {
        int m; // 모듈러 연산의 결과를 받아줄 변수 m 선언
        Get_n_9 rd = new Get_n_9(); // Get_n_9형 객체지시자 rd에 Get_n_9를 객체화
        Get_m_9 md = new Get_m_9(rd); // Get_m_9형 객체지시자 md에 Get_m_9를 객체화

        while(true) {
            try { // 다음 메소드들의 예외를 catch
                m = md.getmod(); // 객체 md의 getmod 메소드를 실행하고 그 결과를 m에 저장
            } catch(MyIOException_91 e) { // MyIOException_91 예외를 catch
                System.out.println(e.toString());  // 그 예외의 클래스 명을 출력
                break; // 반복문 탈출
            } catch(IOException e) { // IOException 예외를 catch
                System.out.println(e.toString()); // 그 예외의 클래스 명을 출력
                break; // 반복문 탈출
            } catch(Exception e) { // 그 외 모든 예외를 catch
                System.out.println(e.toString()); // 그 예외의 클래스 명을 출력
                e.printStackTrace(); // 그 예외의 상세 정보 출력
                break; // 반복문 탈출
            }
            System.out.println("-->" + m); // m (모듈러 연산의 결과)을 출력 
        }
        System.out.println("Stop..."); // 종료를 알리는 Stop... 출력
    }
}

// 내장 클래스 IOExeption도 투척이 가능하고 이것 또한 catch문으로 잡아줄 수 있습니다. 이 내장 예외는 main에서 throw해주어도 실행은 됩니다.
// 모듈러 연산을 0으로 나누어주면 ArithmeticException이 발생합니다. 이는 마지막 catch문이 잡아주고 상세 오류 메세지를 출력합니다.
// 위 오류는 런타임 에러의 자식 클래스중 하나입니다.
// System.out.println(e.toString())으로 예외 클래스 명을 출력할 수 있습니다.
// e.printStackTrace(); // 그 예외의 상세 정보를 출력하고 프로그램을 계속 진행시켜줍니다.