import math
def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
a = list(map(int, input().split()))
b = []
for i in a:
    if b.count(i) == 0:
        b.append(i)
for i in range(1, len(b)):
    b[i] += b[i-1]
check = 0
for i in range(len(b)-1):
    if (isPrime(b[i]) and isPrime(b[len(b)-1] - b[i])):
        check = 1
        print(i)
        break

if check == 0:
    print("NOT FOUND")
