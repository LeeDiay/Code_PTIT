#include <bits/stdc++.h> 
using namespace std;

char c;
int n; 
char x[1005]; 

void Try(int i, char h) 
{
	for (char j = h; j <= c; j++)
	{ 
		x[i] = j; 
	 	if (i == n) 
		{
			for (int k = 1; k <= n; k++) 
				cout << x[k]; 
			cout << endl; 
		}
		else Try(i + 1, j); 
	} 
}

int main() 
{ 
	cin >> c >> n; 
	Try(1, 'A');
}
