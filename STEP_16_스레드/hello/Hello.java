class Thread_1 extends Thread { // 스레드 클래스를 상속받은 스레드1 클래스 정의

    private int sleepTime;
    private int count;
    private String printValue;
    
    Thread_1 (int sleepTime, int count, String printValue) {
        this.sleepTime = sleepTime;
        this.count = count;
        this.printValue = printValue;
    }

    public void run () { // run 메소드의 정의
        for (int i = 0; i < count; i++) { // 10회 반복
            System.out.println(printValue); // 0 출력
            try {
                Thread.sleep(sleepTime); // 이 스레드를 0.5초 쉽니다.
            } catch (InterruptedException e) { // InterruptedException을 받아줍니다.
            }
        }
    }
}
public class Hello {
    public static void main(String[] args) {
        Thread_1 th1 = new Thread_1(500, 10, "1");
        Thread_1 th2 = new Thread_1(500, 10, " 2");
        Thread_1 th3 = new Thread_1(500, 10, "  3");

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) { // InterruptedException 은 예를 들어 스레드의 sleep을 1년으로 해 놓았을때 죽어도 프로그램이 종료되지 않는 경우가 간혹 발생하는데 이를 방지하기 위한 Exception이다 반드시 적절한 처리가 필요하다.
        }
    }
}
