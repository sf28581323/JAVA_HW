#include <iostream>
using namespace std;

int main() {
	int N;
	int M = 0;
	cin >> N;
	
	while(N != 0){
		M = M*10+N%10;
		N = N/10;
	}
	
	cout << M;
	
	return 0;
}
