def check(s):
    if s[len(s) - 2] == '8' and s[len(s) - 1] == '6':
        return True
    else: return False

for t in range(int(input())):
    s = input()
    if (check(s) == True):
        print("YES")
    else: print("NO")