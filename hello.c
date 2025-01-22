#include<stdio.h>

void main(){
    int a =10;

    int *p,**q,***r;
    p=&a;
    q=&p;
    r=&q;
    printf("%d",***r);
}