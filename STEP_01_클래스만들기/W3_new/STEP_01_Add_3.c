#include <stdio.h>
#include <stdlib.h>

typedef struct Add_3 { // 구조체 Add_3 선언
    int x; // 요소 x
    int y; // 요소 y
} Add_3; // Add_3라는 이름의 새로운 데이터타입 이름으로 선언

int main() {
    Add_3 add; // Add_3 형 add 정적 선언
    Add_3 *adp = (Add_3 *)malloc(sizeof(Add_3)); // Add_3 형 adp 동적 선언
}