n, m = map(int, input().split())
check = 0
a = []
Min = 10000
Max = 0
for i in range(n):
    a.append(list(map(int, input().split())))
    Min = min(Min, min(a[i]))
    Max = max(Max, max(a[i]))

for i in range(n):
    for j in range(m):
        if a[i][j] == Max - Min:
            check = 1
if check == 1:
    print(Max - Min)
    for i in range(n):
        for j in range(m):
            if a[i][j] == Max - Min:
                print(f"Vi tri [{i}][{j}]")
if check == 0:
    print("NOT FOUND")