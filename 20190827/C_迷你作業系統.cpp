#include <iostream>
#include <conio.h>
using namespace std;

int main() {
	
	
	cout << "歡迎來到自製作業系統" << endl; 
 	cout << "按下h (for help)..." << endl; 
	char ch;
	while(1){
		ch = getch();
	
		switch(ch){
			case 'h' :
				cout << "(Help)" << endl;
				cout << "這是幫助頁面..." << endl;
				cout << "(F) for find." << endl;
				cout << endl;
				break ;
				
			case 'f' :
				cout << "(Find)" << endl;
				cout << "這是尋找頁面，需要尋找什麼?..." << endl;
				cout << endl;
				break ;
				
			default :
				cout << ch <<": 無效的指令!!" << endl;
		}
	}
	
	// cin >> ch;
	// scanf("%c", &ch);
	// ch = getchar();
	// ch = getche();
	
	return 0;
}
