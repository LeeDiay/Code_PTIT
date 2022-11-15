#include<bits/stdc++.h>

using namespace std;

class SinhVien
{
	private:
		string name, clas, birth;
		float gpa;
	public:
		friend istream &operator >> (istream &is, SinhVien &a);
		friend ostream &operator << (ostream &os, SinhVien a);
};

istream &operator >> (istream &is, SinhVien &a)
{
	getline(is, a.name);
	getline(is, a.clas);
	getline(is, a.birth);
	if (a.birth[2] != '/') 
		a.birth = "0" + a.birth;
	if (a.birth[5] != '/')
		a.birth.insert(3, "0");
	is >> a.gpa;
	return is;
}

ostream &operator << (ostream &os, SinhVien a)
{
	os << "B20DCCN001 " << a.name << " " << a.clas << " "  << a.birth << " " << fixed << setprecision(2) << a.gpa;
	return os;
}

int main()
{
	SinhVien sv;
	cin >> sv;
	cout << sv;	
}

