#include <stdio.h>

int main(int argc, char *argv[]){ // 메인 함수, 쉘에서 받을 문자열과 문자열의 개수를 인수로 받는다.
    int i; // 반복문 변수 i

    printf("Output test...\n"); // Output test...출력
    printf("%d\n", argc); // argc의 개수, 즉 쉘에서 컴파일시 받은 문자열의 개수를 출력

    for(i = 0; i < argc; i++){
        printf("%d-->%s\n", i, argv[i]); // argv의 모든 요소, 즉 쉘에서 컴파일시 받은 모든 문자열을 출력
    }
    return 0;
}