#include <iostream>
#include<cmath>

using namespace std;

int main() {
	while(1){
		int A=0;
		int B=0;
		cin >> A;
		cin >> B;
		if (cin.fail()) break;
		if(A>B){
			cout << "A" << " " << A-B << endl;
			}
		else if(A<B){
			cout << "B" << " " << B-A << endl;
		}
		
		else{
			cout << "0" << endl;
		}
	
	}
		
	
	return 0;
}  	
