#include<bits/stdc++.h>
using namespace std;

void Chuyen(int n, char nguon, char trungGian, char dich)
{
	if (n == 1)
		cout << nguon << " -> " << dich << endl;
	else 
	{
		Chuyen(n - 1, nguon, dich, trungGian);
		Chuyen(1, nguon, trungGian, dich);
		Chuyen(n - 1, trungGian, nguon, dich);
	}
}

int main()
{
	int n;
	cin >> n;
	Chuyen(n, 'A', 'B', 'C');
}
