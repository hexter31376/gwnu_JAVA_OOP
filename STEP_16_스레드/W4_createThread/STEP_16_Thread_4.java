class Thread_1 extends Thread { // 스레드 클래스를 상속받은 스레드1 클래스 정의
    public void run () { // run 메소드의 정의
        for (int i = 0; i < 10; i++) { // 10회 반복
            System.out.println(0); // 0 출력
            try {
                Thread.sleep(500); // 이 스레드를 0.5초 쉽니다.
            } catch (InterruptedException e) { // InterruptedException을 받아줍니다.
            }
        }
    }
}

class Thread_2 extends Thread { // 스레드 클래스를 상속받은 스레드2 클래스 정의
    public void run () { // run 메소드의 정의
        for (int i = 0; i < 10; i++) { // 10회 반복
            System.out.println(1); // 1 출력
            try {
                Thread.sleep(1000); // 이 스레드를 1초 쉽니다.
            } catch (InterruptedException e) { // InterruptedException을 받아줍니다.
            }
        }
    }
}

class Thread_3 extends Thread { // 스레드 클래스를 상속받은 스레드3 클래스 정의
    public void run () { // run 메소드의 정의
        for (int i = 0; i < 10; i++) { // 10회 반복
            System.out.println(2); // 2 출력
            try {
                Thread.sleep(1500); // 이 스레드를 1.5초 쉽니다.
            } catch (InterruptedException e) { // InterruptedException을 받아줍니다.
            }
        }
    }
}

public class STEP_16_Thread_4 {
    public static void main(String[] args) {
        Thread_1 th1 = new Thread_1(); // 스레드 객체화
        th1.start(); // 스레드 실행 메소드
        Thread_2 th2 = new Thread_2(); // 스레드 객체화
        th2.start(); // 스레드 실행 메소드
        Thread_3 th3 = new Thread_3(); // 스레드 객체화
        th3.start(); // 스레드 실행 메소드

        System.out.println("Console thread is going out !!!"); // 스레드 시작을 알리는 콘솔 메세지
    }
}

// 스레드 클래스를 상속해 줌으로서 다중 스레드의 구현을 간단하게 구현할 수 있습니다.
// 원래라면 응답이 순차적으로 나왔겠지만 스레드는 작업의 분리 및 실행이기 때문에 각각의 스레드가 따로 움직이는 것을 확인할 수 있습니다.