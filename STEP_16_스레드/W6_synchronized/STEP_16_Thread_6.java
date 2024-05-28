class MailBox {
    String mail = null, mymail;

    synchronized String get_mail () { // <== Consumer // synchronized로 선언된 변수는 스레드 접근시 반드시 한번에 하나의 스레드만 접근이 가능합니다.
        try {
            while ((mymail = mail) == null) {  // 메일 값을 mymail에 저장하면서 그 값이 null인지 체크합니다. null이면 메일을 받을 대기를 해야 합니다.
                wait(); // 따라서 wait로 호출한 스레드를 notify 메소드로 깨우기 전까지 블록킹(잠시 정지) 시킵니다.
            }
        } catch (InterruptedException e) { // 예외 캐치
        }

        mail = null; // 메일을 널 상태로 만들고
        notify(); // 스레드를 깨웁니다.
        return (mymail); // mymail을 반환합니다.
    }

    synchronized void put_mail (String mail) { // <== Producer // synchronized로 선언된 변수는 스레드 접근시 반드시 한번에 하나의 스레드만 접근이 가능합니다.
        try {
            while ((this.mail) != null) { // 이 스레드의 메일이 비어있지 않으면
                wait(); // 잠시 이 메소드를 호출한 스레드를 블록킹합니다.
            }
        } catch (InterruptedException e) { // 예외 캐치
        }

        this.mail = mail; // 매개변수 메일을 필드 메일로 바꿔줍니다.
        notify(); // 스레드를 깨웁니다.
    }
}
// 동작 요약
// get_mail 메서드(소비자)는 메일이 있을 때까지 기다렸다가 메일을 가져옵니다. 메일을 가져온 후에는 메일 박스를 비우고, 다른 스레드에게 메일을 보낼 수 있도록 알립니다.
// put_mail 메서드(생산자)는 메일 박스가 비어 있을 때까지 기다렸다가 새로운 메일을 보냅니다. 메일을 보낸 후에는 메일이 도착했음을 다른 스레드에게 알립니다.

class Consumer extends Thread { // 주어진 mailbox에서 메일을 꺼내고 보관함을 비우는 스레드
    MailBox mbox; // 메일상자 필드와
    String mail; // 메일 필드로 이루어져 있고

    Consumer (MailBox mbox) { // 매개변수로 받은 메일 박스를 이 객체가 가리킬수 있도록 함
        this.mbox = mbox;
    }

    public void run () {
        while (true) { // 무한 반복
            mail = mbox.get_mail(); // 메일을 읽어옵니다. 다 읽어오면 메일박스의 wait때문에 잠시 블록킹 됩니다.
            System.out.println(mail); // 메일을 출력합니다.
        }
    }
}

class Producer extends Thread { // 메일 박스에 메일을 보관하는 스레드, 보관함이 비어있지 않다면 비워질 때까지 wait 메소드로 인해 대기합니다.
    MailBox mbox; // 메일상자 필드와
    String mail; // 메일 필드로 이루어져 있고

    Producer (MailBox mbox) { // 매개변수로 받은 메일 박스를 이 객체가 가리킬수 있도록 함
        this.mbox = mbox;
    }

    public void run () {
        for (int i = 0; i < 10; i++) { // 10번 반복
            mail = "This is Mail_" + i; // 이것은 메일입니다 + 횟수를 메일 내용으로 저장
            try {
                Thread.sleep(1000);// 스레드 1초 휴식
            } catch (InterruptedException e) { // 예외 캐치
            }
            mbox.put_mail(mail); // 메일 집어넣는 메소드 실행
        }
    }
}

public class STEP_16_Thread_6 {
    public static void main(String[] args) {
        MailBox mbox = new MailBox(); // 메일 박스 객체화

        Consumer thc = new Consumer(mbox); // 소비자 객체 생성 및 메일박스 객체 지시자 넘겨주면서 객체화
        thc.start(); // 해당 스레드 시작

        Producer thp = new Producer(mbox); // 생성자 객체1 생성 및 메일박스 객체 지시자 넘겨주면서 객체화
        thp.start(); // 해당 스레드 시작

        Producer thq = new Producer(mbox); // 생성자 객체2 생성 및 메일박스 객체 지시자 넘겨주면서 객체화
        thq.start(); // 해당 스레드 시작
        try {
            thp.join(); // 이 메소드를 포함하고 있는 스레드, 즉 메인 메소드를 해당 스레드가 끝날때까지 잠시 정지시킵니다.
            thq.join(); // 이 메소드를 포함하고 있는 스레드, 즉 메인 메소드를 해당 스레드가 끝날때까지 잠시 정지시킵니다.
        } catch (InterruptedException e) {
        }

        System.out.println("Console thread is going out !!!"); // 스레드 시작을 알리는 콘솔 메세지
        System.exit(0); // 프로그램 종료
    }
}
