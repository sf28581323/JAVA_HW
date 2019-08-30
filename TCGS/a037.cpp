#include <iostream>
#include<cmath>

using namespace std;

int main() {
	int N;
	cin >> N;
	for(int i=1;i<=N;i++){
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
	else{
		cout << "0" << endl;
	}
	}
	
	return 0;
}  	
