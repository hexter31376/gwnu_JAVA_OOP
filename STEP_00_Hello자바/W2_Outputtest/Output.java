import java.io.*;

class Output { // 파일명과 동일한 Hello 클래스 생성
    public static void main(String[] args) { // 메인 메소드, 쉘에서 입력하는 문자열을 인수로 받는다.
        int i;

        // args의 길이, 즉 쉘에서 컴파일시 받은 문자열의 개수를 출력 ------------------------------------------------

        System.out.print("Output test...\n"); // 문자열과 변수 출력(지금은 문자열) 자동 개행 안됨
        System.out.print(args.length); // 문자열과 변수 출력(지금은 변수) 자동 개행 안됨
        System.out.print("Output test..." + args.length + "\n"); // 문자열과 변수 출력(지금은 둘다) 자동 개행 안됨

        System.out.println("Output test..."); // 문자열과 변수 출력(지금은 문자열) 자동 개행 됨
        System.out.println(args.length); // 문자열과 변수 출력(지금은 변수) 자동 개행 됨
        System.out.println("Output test..." + args.length + "\n"); // 문자열과 변수 출력(지금은 변수) 자동 개행 됨

        System.out.printf("Output test...%d\n", args.length); // c언어의 printf와 동일하게 작동합니다. 굳이 다르다면 개행이 자동으로 들어갑니다.

        // args의 모든 요소, 즉 쉘에서 컴파일시 받은 모든 문자열을 출력 ----------------------------------------------
        for(i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
