#include <iostream>
#include<cmath>

using namespace std;

int main() {
	int sum;
	int N = 0;
	cin >> N;
	
	sum = N;
	while(N>=5){
		N = N -5 +1;
		sum ++;
	}
	cout << sum;
	
	return 0;
}  	
