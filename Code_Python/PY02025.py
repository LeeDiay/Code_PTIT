n, m = map(int, input().split())
a = sorted(set(map(int, input().split())))
b = sorted(set(map(int, input().split())))
for i in a:
    if i in b:
        print(i, end=' ')
print()

for i in a:
    if i not in b:
        print(i, end=' ')
print()

for i in b:
    if i not in a:
        print(i, end=' ')