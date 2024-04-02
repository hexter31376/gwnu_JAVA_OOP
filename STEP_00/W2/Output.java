class Output {
    public static void main(String[] args) {
        int i;
        System.out.print("Output test...\n"); //출력값에 자동으로 개행문자가 적용되지 않는다.
        System.out.println("Output test..."); //출력값에 자동으로 개행문자가 적용된다.
        System.out.println(args.length); //args의 길이를 출력한다.
        System.out.printf("%d\n", args.length); //c언어의 printf와 동일하게 주어진 내용들을 포맷 문자열에 맞춰 출력한다.
        for(i = 0; i < args.length; i++)
            System.out.println(args[i]); //명령어 인수로 받은 내용을 하나씩 출력하는 로직
    }
}
