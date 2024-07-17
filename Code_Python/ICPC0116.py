for i in range (int(input())):
    s = input()
    if s[0] != s[len(s) - 1]:
        print("NO")
    else:
        print("YES")