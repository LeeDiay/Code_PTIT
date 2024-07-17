from datetime import datetime

class HoaDon:
    def __init__(self, id, name, soPhong, den, di, phatSinh):
        self.id = id
        self.name = name
        self.soPhong = soPhong
        self.phatSinh = int(phatSinh)
        self.soNgay = (datetime.strptime(di, "%d/%m/%Y") - datetime.strptime(den, "%d/%m/%Y")).days + 1
        if soPhong[0] == '1':
            self.gia = 25
        elif soPhong[0] == '2':
            self.gia = 34
        elif soPhong[0] == '3':
            self.gia = 50
        else:
            self.gia = 80
        self.tienPhong = self.soNgay * self.gia + self.phatSinh

    def __str__(self):
        return f"{self.id} {self.name} {self.soPhong} {self.soNgay} {self.tienPhong}"


hd = []
for i in range(int(input())):
    id = 'KH{:02}'.format(i + 1)
    name = input()
    soPhong = input()
    den = input().strip()
    di = input().strip()
    phatSinh = input()
    hd.append(HoaDon(id, name, soPhong, den, di, phatSinh))

hd.sort(key=lambda x: (-x.tienPhong))

for hoa_don in hd:
    print(hoa_don)
