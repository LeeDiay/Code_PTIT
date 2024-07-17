class GiaoVien:
    def __init__(self, id, name, code, diemTin, diemChuyenMon):
        self.id = id
        self.name = name
        if code[0] == 'A':
            self.label = "TOAN"
        elif code[0] == 'B':
            self.label = "LY"
        else: self.label = "HOA"
        if code[1] == '1':
            self.total = diemTin * 2 + diemChuyenMon + 2
        elif code[1] == '2':
            self.total = diemTin * 2+ diemChuyenMon + 1.5
        elif code[1] == '3':
            self.total = diemTin * 2 + diemChuyenMon + 1
        else: 
            self.total = diemTin * 2 + diemChuyenMon
        self.status = self.getStatus()
    
    def getStatus(self):
        if self.total >= 18:
            return "TRUNG TUYEN"
        else: return "LOAI"
    
    def __str__(self):
        return f"{self.id} {self.name} {self.label} {self.total:.1f} {self.status}"
    
gv = []
for i in range(int(input())):
    id = "GV{:02}".format(i+1)
    gv.append(GiaoVien(id, input(), input(), float(input()), float(input())))

gv.sort(key=lambda x : (-x.total, x.id))
for i in gv:
    print(i)
        