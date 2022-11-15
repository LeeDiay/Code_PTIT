#include <bits/stdc++.h>
using namespace std;
#define F(i,a,b) for(int i=a;i<b;i++) 
int main() 
{ 
	int n,m,p,k=0;cin>>n>>m>>p; 
	int a[n][m],b[m][p],c[n][p]; 
	F(i,0,n)
	{ 
		F(j,0,m) 
		cin>>a[i][j]; 
	}
	F(i,0,m)
	{
		F(j,0,p)
		cin>>b[i][j]; 
	} 
	F(i,0,n)
	{
		F(j,0,p)
		{
			F(x,0,m) 
			{ 
				k=k+a[i][x]*b[x][j]; 
				c[i][j]=k; 
			} 
			k=0; 
		} 
	} 
	F(i,0,n)
	{ 
		F(j,0,p)
		{ 
			cout<<c[i][j]<<" "; 
		}
	cout << endl; 
	}
}
