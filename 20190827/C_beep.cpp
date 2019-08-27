#include <iostream>
#include<windows.h>
using namespace std;

int main() {
 	int tempo = 300;
 	
 	int Do = 523, Re = 587, Mi = 659, Fa = 698, So = 784, La = 880, Si = 988;
	 
	Beep(Do, 1* tempo); 
	Beep(Do, 1* tempo); 
	Beep(So, 1* tempo); 
	Beep(So, 1* tempo); 
	Beep(La, 1* tempo); 
	Beep(La, 1* tempo); 
	Beep(So, 1* tempo); 
	
	return 0;
}
