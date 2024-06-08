class PThread extends Thread {
    static double partialTotal;
    static final long COUNT_PER_THREAD = 0x7ffffffffL / 4; // 전체 작업을 스레드 수로 분할

    public void run() {
        partialTotal = 0;
        for (long i = 0; i < COUNT_PER_THREAD; i++) {
            partialTotal += 1; // 1을 누적
        }
    }
}

public class Parallel {
    public static void main(String[] args) {
        PThread pth1 = new PThread();
        PThread pth2 = new PThread();
        PThread pth3 = new PThread();
        PThread pth4 = new PThread();

        pth1.start();
        pth2.start();
        pth3.start();
        pth4.start();

        try {
            pth1.join();
            pth2.join();
            pth3.join();
            pth4.join();
        } catch (InterruptedException e) {
            // Interrupted 예외 처리
            e.printStackTrace();
        }

        double total = PThread.partialTotal * 4; // 각 스레드의 부분 결과를 합산
        System.out.println("Total: " + total);
    }
}
