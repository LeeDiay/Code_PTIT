#include<bits/stdc++.h>

using namespace std;

class SinhVien
{
	private:
		string name, clas, birth;
		float gpa;
	public:
		void nhap();
	    void xuat();
};

void SinhVien::nhap()
{
	getline(cin, name);
	cin >> clas >> birth;
	if (birth[2] != '/') 
		birth.insert(0, "0");
	if (birth[5] != '/')
		birth.insert(3, "0");
	cin >> gpa;
}

void SinhVien::xuat()
{
	cout << "B20DCCN001 " << name << " " << clas << " " << birth << " " << fixed << setprecision(2) << gpa;
}

int main()
{
	SinhVien sv;
	sv.nhap();
	sv.xuat();
}
