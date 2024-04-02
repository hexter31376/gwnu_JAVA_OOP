#include <stdio.h>

int main(int argc, char *argv[]){
    int i;
    printf("Output test...\n");
    printf("%d\n", argc); // 명령줄 인수의 개수
    for(i = 0; i < argc; i++)
        printf("%d-->%s\n", i, argv[i]);
        // 명령줄 인수 배열 위치에 어떤 값이 저장되었는지 보여주는 로직
}