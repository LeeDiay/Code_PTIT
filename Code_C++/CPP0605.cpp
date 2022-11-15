#include<bits/stdc++.h>

using namespace std;

class PhanSo
{
	private: 
		long long tu, mau;
	public: 
		PhanSo(long long tu, long long mau)
		{
			this->tu = tu;
			this->mau = mau;
		}
		friend istream &operator >> (istream &is, PhanSo &a);
		friend ostream &operator << (ostream &os, PhanSo a);
		void rutgon();
};

istream &operator >> (istream &is, PhanSo &a)
{
	is >> a.tu >> a.mau;
	return is;
}

void PhanSo::rutgon()
{
	long long uc = __gcd(tu, mau);
	tu /= uc;
	mau /= uc;
}

ostream &operator << (ostream &os, PhanSo a)
{
	os << a.tu << "/" << a.mau;
	return os;
}

int main() {
	PhanSo p(1,1);
	cin >> p;
	p.rutgon();
	cout << p;
	return 0;
}
