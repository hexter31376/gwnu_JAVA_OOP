#include <stdio.h>
int add2i(int, int); //add 2 integers
int main(int argc, char *argv[]){
    int x, y, z;

    x = getchar() - '0';
    y = getchar() - '0';
    z = add2i(x, y);

    printf("%d + %d = %d\n", x, y, z);
    return 0;
}
int add2i(int a, int b){
    int s;
    s = a + b;
    return(s);
}