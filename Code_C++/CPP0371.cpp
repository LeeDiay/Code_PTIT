#include<bits/stdc++.h> 

using namespace std; 

void process()
{
	string s;
	cin >> s;
	int i;
	for (i = 0; i < s.length(); i++)
		if (s[i] != 'U' && s[i] != 'E' && s[i] != 'O' && s[i] != 'A' && s[i] != 'I' && s[i] != 'Y' && s[i] != 'u' && s[i] != 'e' && s[i] != 'o' && s[i] != 'a' && s[i] != 'i' && s[i] != 'y')
		{
			s[i] = tolower(s[i]);
			cout << "." << s[i];
	    }
		
}

int main() 
{ 
	process();
}
