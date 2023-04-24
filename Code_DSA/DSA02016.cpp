#include <bits/stdc++.h>
using namespace std;

int dem, n;
int cot[100], xuoi[100], nguoc[100];

void Try(int i)
{
	for (int j = 1; j <= n; j++)
		if (cot[j] == 1 && xuoi[i - j + n] == 1 && nguoc[i + j - 1] == 1)
		{
			cot[j] = xuoi[i - j + n] = nguoc[i + j - 1] = 0;
			if (i == n)
				dem++;
			else Try(i+1);
			cot[j] = xuoi[i - j + n] = nguoc[i + j - 1] = 1;
		}
	
}

void process()
{
	int t, i;
	cin >> t;
	while (t--)
	{
		for (i = 1; i <= 100; i++)
			cot[i] = xuoi[i] = nguoc[i] = 1;
		cin >> n;
		dem = 0;
		Try(1);
		cout << dem << endl;
	}
}

int main() 
{
	process();    
}

