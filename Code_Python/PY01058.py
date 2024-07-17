from math import sqrt

def isPrime(n):
    if n < 2:
        return False
    square = int(sqrt(n) + 1)
    for i in range(2, square):
        if not n % i:
            return False
    return True

for t in range(int(input())):
    s = input()
    a = int(s[len(s) - 4 : len(s)])
    if isPrime(a):
        print("YES")
    else: print("NO")