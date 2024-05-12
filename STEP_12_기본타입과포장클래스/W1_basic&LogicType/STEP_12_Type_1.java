class Type_1 {
    void type_test(){
        boolean bl = false; // true or false
        byte bt = 65; // signed 1 byte integer
        short st = 0x41; // signed 2 byte integer
        char ch = 'A'; // unsigened 2 byte integer
        int it = 0101; // signed 4 byte integer
        long lg = 'B' - 1; // signed 8 byte integer
        float ft = 1e-2f; // 4 byte real : (float)10e-2
        double db = 0.01; // 8byte real

        System.out.println(bl); // 해당 자료형 출력
        System.out.println(bt); // 해당 자료형 출력
        System.out.println(st); // 해당 자료형 출력
        System.out.println(ch); // 해당 자료형 출력
        System.out.println(it); // 해당 자료형 출력
        System.out.println(lg); // 해당 자료형 출력
        System.out.println(ft); // 해당 자료형 출력
        System.out.println(db); // 해당 자료형 출력
        System.out.printf("%b, %d, %d, %c, %d, %d, %f, %f\n", bl, bt, st, ch, it, lg, ft, db); // printf로 해당 자료형 출력

        ch = (char)bt; // byte형(1byte) bt를 char형(1byte) ch에 명시적 형변환 후 집어넣기
        it = ch; // char형(1byte) chfmf int형(4byte) it에 자동 형변환 후 집어넣기
        bt = (byte)ch; //char형(1byte) ch를 byte형(1byte) bt에 명시적 형변환 후 집어넣기
    }
}
public class STEP_12_Type_1 {
    public static void main(String[] args) {
        Type_1 typ1 = new Type_1(); // Type_1형 typ1 객체지시자로 객체화한 Type_1 지정
        typ1.type_test(); // typ1.type_test 메소드 호출
    }
}

// 기본 저장 타입은 객체를 형성하는 랩이 없고 오로지 해당 값의 비트 패턴을 저장하기 위한 공간만을 즉시 할당받습니다(정적 할당)
// 1. C언어와 비교하면 boolean, byte타입이 추가
// 2. 모든 정수 타입은 signed로 고정
// 3. char는 2바이트 자바 유니코드 저장을 위해 unsigned로 고정
// 4. 데이터형 축소 대입시 반드시 타입 캐스팅을 해주어야 함
// 2. 참/거짓은 반드시 boolean 데이터형을 사용해야 함(논리식의 결과)