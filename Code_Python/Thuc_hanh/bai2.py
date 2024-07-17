for t in range(int(input())):
    a = []
    for i in range(int(input())): 
        a.append([int(x) for x in input().split()])
    a.sort(key=lambda x : x[1])
    print(a)
    res, pre = 0, -1
    for i in a:
        if i[0] >= pre:
            res += 1
            pre = i[1]
    print(res)
