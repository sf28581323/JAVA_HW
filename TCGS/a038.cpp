#include <iostream>
#include<cmath>

using namespace std;

int main() {
	for(;;){
		int A;
		int B;
		cin >> A;
		cin >> B;
		if(A>B){
			cout << "A" << " " << A-B << endl;
			}
		else if(A<B){
			cout << "B" << " " << B-A << endl;
		}
		else if (A==0&&B==0) break;
		else{
			cout << "0" << endl;
		}
	
	}
		
	
	return 0;
}  	
