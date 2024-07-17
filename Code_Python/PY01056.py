from math import sqrt


def check(i):
    if int(i) % 2 == 0:
        return True 
    else: return False 

def tongcs(n):
    sum = 0
    s = int(n)
    while (s != 0):
        sum += s % 10
        s //= 10
    return sum

def isPrime(n):
    if n < 2:
        return False
    square = int(sqrt(n) + 1)
    for i in range(2, square):
        if not n % i:
            return False
    return True

def hihi(s):
    for i in range(0, len(s)):
        if (i % 2 == 1) and (check(s[i]) == True):
            return False
        if (i % 2 == 0) and (check(s[i]) == False):
            return False
    return True
for t in range(int(input())):
    s = input()
    if hihi(s) and (isPrime(tongcs(s))):
        print("YES")
    else: print("NO")