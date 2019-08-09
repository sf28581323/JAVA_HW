#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

//↓不用看 
void printBits(size_t const size, void const * const ptr)
{
    unsigned char *b = (unsigned char*) ptr;
    unsigned char byte;
    int i, j;

    for (i=size-1;i>=0;i--)
    {
        for (j=7;j>=0;j--)
        {
            byte = (b[i] >> j) & 1;
            printf("%u", byte);
        }
    }
    puts("");
}

int main() {
	int a = 0b1011;
	int b = 0b1111;
	
	int c = a | b; //or運算
	printf("%d\n", a & b); //and運算
	
	printBits(sizeof(c), &c);
	
	return 0;
}

