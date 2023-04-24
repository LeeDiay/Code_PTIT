#include<bits/stdc++.h>
using namespace std;

string s;
int n;
vector<int> test;
vector<string> res;

void Try(int m)
{
	if(m == n)
	{
		if(find(test.begin(), test.end(), 0) == test.end())
			res.push_back(s);
		return;
	}
	for(int i = 0; i<=1; i++)
	{
		if(i == 0)
			s[m] = 'H';
		else s[m] = 'A';
		test[m] = 1;
		if(m == 0 && s[m] == 'A')
			test[m] = 0;
		if(m == n-1 && s[m] == 'H')
			test[m] = 0;
		if(s[m] == 'H' && s[m-1] == 'H')
			test[m] = 0;
			
		Try(m+1);	
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    	
	int t;
	cin >> t;
	while(t--)
	{
		
    	
		cin >> n;
		s.resize(n);
		test.resize(n, 1);
		res.clear();
		Try(0);
		
		sort(res.begin(), res.end());
		for(auto x : res)
			cout << x << endl;
	}
}
