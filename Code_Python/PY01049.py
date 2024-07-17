from math import sqrt

def isPrime(n):
    if n < 2:
        return False
    square = int(sqrt(n) + 1)
    for i in range(2, square):
        if not n % i:
            return False
    return True

def check(s):
    nt = 0
    knt = 0
    for i in range(0, len(s)):
        if (isPrime(int(s[i]))):
            nt = nt + 1
        else: knt = knt+1
    if nt > knt:
        return True 
    else: return False 

for t in range(int(input())):
    s = input()
    if isPrime(len(s)) and check(s):
        print("YES")
    else: print("NO")
    
        
