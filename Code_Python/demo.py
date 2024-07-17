for t in range(int(input())):
    n = input()
    res = 1
    a = list(n[1::2])
    for i in a:
        if i == 0:
            continue
        else: 
            res *= int(i)
    if res == 1:
        res = 0
    b = list(n[0::2])
    sum = 0
    for i in b:
        sum += int(i)
    print(sum, res, end=" ")
    print()