#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

int main() {
	
	double x1, y1, x2, y2;
	cin >> x1;
	cin >> y1;
	cin >> x2;
	cin >> y2;
	
	cout << fixed << setprecision(3) << sqrt(pow((x2-x1),2) + pow((y2-y1),2));
	
	
	return 0;
}

