import java.io.*;

class ZeroException extends Exception { //  예외를 상속받은 커스텀 예외

}

class OvfException extends Exception { //  예외를 상속받은 커스텀 예외

}

class GetN {
    int get_n() throws IOException, ZeroException { // 이때 여기서 throw해준 예외는 다음 메소드로 넘겨줄 수 있다.
        int n = System.in.read() - '0'; // 사용자에게 정수 입력받기
        if (n == 0) { // 입력받은 수가 0이면
            throw new ZeroException(); // 커스텀 ZeroException을 throw
        }
        return n; // 입력받은 정수 리턴
    }
}

class AddN {
    GetN gn; // 위에서 선언한 메소드형 지시자 선언

    AddN(GetN gn) {
        this.gn = gn; // 입력받은 GetN형 객체를 gn 필드에 집어넣기
    }

    int get_addn() throws IOException, ZeroException, OvfException { // 넘겨받은 예외도 catch해주지 않으면 같이 넘겨줄것을 선언해야 한다.
        int n = gn.get_n(); // 사용자에게 정수 입력받는 메소드 호출
        n = n + 1; // 그 값에 1을 더하고
        if (n > 5) { // 그 값의 범위가 0~4 범위이면
            throw new OvfException(); // 커스텀 OvfException을 throw
        }
        return n; // n값을 리턴
    }
}

class H1_Exception {
    public static void main(String[] args) throws IOException{
        AddN adn = new AddN(new GetN()); // AddN 형 adn 객체지시자에 AddN을 객체화하고 그 객체 생성자에 GetN을 객체화해서 집어넣는다
        try { // try문으로 코드 실행하고 catch문으로 받을 준비
            int n = adn.get_addn(); // 객체화한 adn으로 값 입력받기
            System.out.print(n); // 입력받은 값 출력하기
        } catch (ZeroException e) { // ZeroException이 발생하면
            System.out.println("ZeroException"); // ZeroException 출력하기
        } catch (OvfException e) { // OvfException이 발생하면
            System.out.println("OvfException"); // OvfException 출력하기
        }
    }
}