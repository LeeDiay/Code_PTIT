class ThiSinh:
    def __init__(self, name, birth, diem1, diem2, diem3):
        self.name = name
        self.birth = birth
        self.diem1 = float(diem1)  # Chuyển đổi điểm thành số thực
        self.diem2 = float(diem2)  # Chuyển đổi điểm thành số thực
        self.diem3 = float(diem3)  # Chuyển đổi điểm thành số thực
        self.total = self.diem1 + self.diem2 + self.diem3

    def __str__(self):
        return self.name + ' ' + self.birth + ' ' + '{:.1f}'.format(self.total)

a = ThiSinh(input(), input(), input(), input(), input())
print(a)
       