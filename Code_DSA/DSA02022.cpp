#include <bits/stdc++.h>
using namespace std;

int a[1000], n;



void In(int a[], int n)
{
	if (a[5] == 1 && (a[1] + a[2] != 0) && (a[3] + a[4] != 0) && (a[3] != 1))
	{
		for (int i = 1; i <= n; i++)
		{
			if (a[i] == 1) cout << "2";
			else cout << a[i];
			if (i == 2 || i == 4)	cout << "/"; 
		}
		cout << endl;
	} 
}

void SinhNhiPhan(int a[], int n)
{
	int i;
	for (i = 1; i <= n; i++)
		a[i] = 0;
	while (1) 
	{
		In(a, n);
		int i = n;
		while (i > 0 && a[i] == 1)
		{
			a[i] = 0;
			i--;
		}
		if (i == 0) return;
		else a[i] = 1;
	}
}


void process()
{
	n = 8;
	SinhNhiPhan(a, n);
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
