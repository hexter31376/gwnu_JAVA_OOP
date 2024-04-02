#include <stdio.h>

int main(int argc, char *argv[]){
    int x,y,z;
    x = getchar();
    y = getchar();
    z = (x -'0') + (y -'0');
    printf("%c + %c = %d\n", x, y, z);
}