class Hello {
    public static void main(String args[]) {
        // 정적이면서 외부에서 접근 가능한 함수,
        // 매개변수에 꼭 String args[] (문자열 참조 변수 args)
        // 를 적어줘야 커맨드 창에서의 java 명령어 인수를 받을 수 있으므로
        // 입력을 받지 않더라도 무조건 고정이라 보아도 무방하다.
        System.out.println("Hello");
    }
}