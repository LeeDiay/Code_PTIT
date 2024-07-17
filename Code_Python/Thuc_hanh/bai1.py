n = int(input())
a = sorted(list(map(int, input().split())))
max1 = a[-1] * a[-2]
max2 = a[-1] * a[-2] * a[-3]
max3 = a[0] * a[1]
max4 = a[0] * a[1] * a[-1]
max5 = max(max1, max2)
max6 = max(max3, max4)
print(max(max5, max6))
