while True:
    n = int(input())
    if n == 0: break
    a = []
    for i in range(n):
        a.append(int(input()))
        a.sort()
    min = a[0]
    max = a[-1]
    if min == max:
        print("BANG NHAU")
    else:
        print(min, max, end = " ")
        print()
