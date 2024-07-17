import math
class HocSinh:
    def __init__(self, id, name, diem1, diem2, diem3, diem4, diem5, diem6, diem7, diem8, diem9, diem10):
        self.name = name
        self.id = id
        self.diemTB = (diem1 * 2 + diem2 * 2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 +diem10) 
        self.diemTB = round(self.diemTB / 12 + 0.01, 1)
        if self.diemTB >= 9:
            self.xepLoai = "XUAT SAC"
        elif self.diemTB >= 8:
            self.xepLoai = "GIOI"
        elif self.diemTB >= 7:
            self.xepLoai = "KHA"
        elif self.diemTB >= 5:
            self.xepLoai = "TB"
        else: self.xepLoai = "YEU"
    
    def __str__(self):
        return self.id + " " + self.name + " " + '{:.1f}'.format(self.diemTB) + " " + self.xepLoai
    
hs = []
for i in range(int(input())):
    id = 'HS{:02}'.format(i+1)
    name = input()
    diem = [float(x) for x in input().split()]
    hs.append(HocSinh(id, name, *diem))
hs.sort(key=lambda x : (-x.diemTB, x.id))
for i in hs:
    print(i)