for t in range(int(input())):
    s = input() 
    check = 1
    for i in range(len(s)-1):
        if ord(s[i]) > ord(s[i+1]):
            check = 0
            break
    if check == 0:
        print("NO")
    else: print("YES")