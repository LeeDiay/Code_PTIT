from decimal import Decimal
import math
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self, p):
        x0 = self.x - p.x
        y0 = self.y - p.y
        ans = math.sqrt(x0 * x0 + y0 * y0)
        return '{:.4f}'.format(ans)

if __name__ == '__main__':
    t = int(input())
    while t > 0:
        arr = input().split()
        p1 = Point(Decimal(arr[0]), Decimal(arr[1]))
        p2 = Point(Decimal(arr[2]), Decimal(arr[3]))
        print(p1.distance(p2))
        t -= 1