#include<bits/stdc++.h>

using namespace std;

string SumTwoBigNumber(string a, string b)
{
	int i;
	while (a.size() < b.size()) 
		a = "0" + a;
	while (b.size() < a.size())
		b = "0" + b;
	int len = a.size();
	string res = "";
	int nho = 0, so;
	for (i = len - 1; i >= 0; i--)
	{
		so = int(a[i] - '0') + int(b[i] - '0') + nho;
		res = char(so % 10 + '0') + res;
		nho = so / 10;
	}
	if (nho > 0) 
		res = char(nho + '0') + res;
	return res;
}

void process()
{
	string a, b, c;
	cin >> a >> b;
	int i, n;
	c = SumTwoBigNumber(a, b);
	cout << c << " ";
}

int main()
{
	process();
}
