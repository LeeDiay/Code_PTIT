class HoaDon:
    def __init__(self, maDH, ten, soLuong, gia, chietkhau) -> None:
        self.maDH = maDH
        self.ten = ten
        self.soLuong = soLuong
        self.gia = gia
        self.chietkhau = chietkhau
        self.tongTien = soLuong * gia - chietkhau
    def __str__(self) -> str:
        return self.maDH + ' ' + self.ten + ' ' + str(self.soLuong) + ' ' + str(self.gia) + ' ' + str(self.chietkhau) + ' ' + str(self.tongTien) 
a = []
for i in range(int(input())): 
    a.append(HoaDon(input(), input(), int(input()), int(input()), int(input())))
for i in sorted(a, key=lambda x: -x.tongTien): 
    print(i)
