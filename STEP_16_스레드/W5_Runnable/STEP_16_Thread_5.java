class Counter implements Runnable { // Runnable 인터페이스를 이식받은 Counter 클래스 정의
    int total = 0, from, to; // 총합, 시작 숫자와 종료 숫자 필드 보유

    Counter (int from, int to) { // 객체 생성자로 필드 from과 to 설정
        this.from = from;
        this.to = to;
    }

    public void run () { // from 부터 to 까지의 숫자의 구간 합을 구하는 메소드
        for (int i = from; i <= to; i++) {
            total += i;
        }
    }
    int get_total () { // total을 리턴하는 메소드
        return (total);
    }
}

public class STEP_16_Thread_5 {
    public static void main(String[] args) {
        Counter cn1, cn2, cn3, cn4; // 카운터형 객체 지시자 선언

        cn1 = new Counter(1, 25); // 객체화 및 초기값 집어넣기
        cn2 = new Counter(26, 50); // 객체화 및 초기값 집어넣기
        cn3 = new Counter(51, 75); // 객체화 및 초기값 집어넣기
        cn4 = new Counter(76, 100); // 객체화 및 초기값 집어넣기

        Thread th1, th2, th3, th4; // 스레드형 객체 지시자 선언

        th1 = new Thread(cn1); // 스레드 생성과 동시에 Runnable 인터페이스를 이식받은 객체를 집어넣는다
        th2 = new Thread(cn2); // 스레드 생성과 동시에 Runnable 인터페이스를 이식받은 객체를 집어넣는다
        th3 = new Thread(cn3); // 스레드 생성과 동시에 Runnable 인터페이스를 이식받은 객체를 집어넣는다
        th4 = new Thread(cn4); // 스레드 생성과 동시에 Runnable 인터페이스를 이식받은 객체를 집어넣는다

        th1.start(); // 스레드 실행
        th2.start(); // 스레드 실행
        th3.start(); // 스레드 실행
        th4.start(); // 스레드 실행

        try {
            th1.join(); // 스레드가 종료될때까지 대기 (main)
            th2.join(); // 스레드가 종료될때까지 대기 (main)
            th3.join(); // 스레드가 종료될때까지 대기 (main)
            th4.join(); // 스레드가 종료될때까지 대기 (main)
        } catch (InterruptedException e) {
        }

        int Total = cn1.get_total() + cn2.get_total() + cn3.get_total() + cn4.get_total(); // 스레드의 결과값 더하기

        System.out.println("Total = " + Total); // 총합 출력
        System.out.println("Console thread is going out !!!"); // 스레드 시작을 알리는 콘솔 메세지
        System.exit(0); // 프로그램 종료
    }
}

// 클래스 Thread 상속이 어려울 경우 (다른 클래스를 상속 받았을때 자바는 다중 상속을 지원하지 않으므로)
// 대신 runnerble 인터페이스를 이식하여 정의한 후 Thread 클래스를 객체화 하는 도중에 매개변수로 넣어줌으로서 처리가 가능합니다.
// th1.join() 은 현재 스레드를 잠시 정지시키는데 이때의 현재 클래스는 main이 되게 됩니다.
// 이렇게 해 주는 이유는 Total을 스레드가 다 완료된 후에 더해주어야 하기 때문입니다. 메인이 그냥 실행되면 안됩니다.

// 스레드는 main 순차 실행에 아무런 영향을 줄수 없기 때문입니다.