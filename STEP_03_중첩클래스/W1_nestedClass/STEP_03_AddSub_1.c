#include <stdio.h>

typedef struct customer { // 구조체 customer 선언
    struct student { // customer 내부 구조체 student 선언
        char name[10]; // 요소 name
        int stdno; // 요소 stdno
    } std; // std로 부를 것을 선언
    struct worker { // customer 내부 구조체 worker 선언
        char name[10]; // 요소 name
        int regno; // 요소 regno
    } wkr; // wkr로 부를 것을 선언
}customer; // customer로 부를 것을 선언