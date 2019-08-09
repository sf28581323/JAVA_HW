#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

int main() {
	int a = 0x001;
	printf("%d\n", a);
	//a = a << 10;
	printf("%d\n", a << 10);
	cout << a << 10;
	return 0;
}
