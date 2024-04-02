import java.io.*; // java.io를 끌고오는데 .*이므로 하위 내용들을 모두 끌고온다.

class Input {
    public static void main(String[] args) throws IOException {
        int x, y, z;

        x = System.in.read();
        // 키보드에서의 가장 기본적인 입력값
        // c언어의 getchar 함수와 동일한 역할을 한다.
        // 즉 '문자 단 1개' 그 자체를 받아주는 기본 메소드이다.
        // 숫자 1을 입력해도 아스키코드 1이 입력되는 것과 마찬가지이므로
        // 이걸 이용해서 정수를 입력받으려면 아스키코드 '0'을 빼주는 과정이 필요하다.
        // 아래 내용을 그에 대한 증명을 보여주는 코드이다.
        y = System.in.read();
        z = (x - '0') + (y -'0');
        System.out.printf("x = %c, %d(%x), y = %c, %d(%x)\n", x, x, x, y, y, y);

        System.out.printf("%c + %c = %d\n", x, y, z);
    }
}
