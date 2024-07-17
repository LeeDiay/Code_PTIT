class HoaDon:
    def __init__(self, id, name, old, new):
        self.name = name
        self.id = id
        self.tieuThu = new - old
        if self.tieuThu > 100:
            self.tienDien = round((50 * 100 + 50 * 150 + (self.tieuThu - 100) * 200) * 1.05)
        elif self.tieuThu > 50:
            self.tienDien = round((50 * 100 + (self.tieuThu - 50) * 150) * 1.03)
        else: 
            self.tienDien = self.tieuThu * 100 * 1.02
       
    def __str__(self):
        return f"{self.id} {self.name} {self.tienDien:.0f}"
hd = []
for i in range(int(input())):
    id = 'KH{:02}'.format(i+1)
    hd.append(HoaDon(id, input(), int(input()), int(input())))
hd.sort(key=lambda x : (-x.tienDien, x.id))
for i in hd: 
    print(i)