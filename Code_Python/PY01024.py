def check1(s):
    sum = 0
    while s != 0:
        sum  += s % 10
        s //= 10
    if sum % 10 == 0: 
        return True
    else: return False

def check2(s):
    while s > 10:
        duoi1 = s % 10
        duoi2 = (s//10) % 10
        s //= 10
        if (abs(duoi1-duoi2) != 2):
            return False
    return True
            
for t in range(int(input())):
    s = int(input())
    
    if (check1(s) == True) and (check2(s) == True):
        print("YES")
    else: print("NO")