#include <iostream>
using namespace std;

int main() {
	char str[4] = {'1','2','3','4'};

 	puts(str);
 	putchar(str[0]);
	
	for(int i=0; i<4; i++){
		printf("%c", str[i]);
	}
	
	return 0;
}
