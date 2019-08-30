#include <iostream>
#include<cmath>

using namespace std;

int main() {
	double a;
	double b;
	int c;
	cin >> a;
	cin >> b;
	c = floor(b*log10(a));
	cout << c+1;
	return 0;
}
