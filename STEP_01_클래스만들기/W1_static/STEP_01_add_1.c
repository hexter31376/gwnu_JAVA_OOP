#include <stdio.h>
int add2i(int, int); // 정수 2개를 더하는 함수를 만들 것을 선언
int main(int argc, char *argv[]){
    int x, y, z; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장한 z 선언

    x = getchar() - '0'; // getchar로 문자 1개 입력받고 x에 저장
    y = getchar() - '0'; // getchar로 문자 1개 입력받고 y에 저장
    z = add2i(x, y); // add2i를 호출하고 반환하는 값을 add2i에 저장

    printf("%d + %d = %d\n", x, y, z); // x + y = z 출력
    return 0;
}
int add2i(int a, int b){ // 정수 2개를 더하고 더한 값을 반환하는 함수
    int s; // 더한 값을 저장할 s
    s = a + b; // 인수로 받은 정수 2개를 더하고 s에 저장
    return(s); // s 반환
}