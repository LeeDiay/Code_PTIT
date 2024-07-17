for t in range(int(input())):
    s = input()
    tmp = ""
    for i in s:
        if i.isnumeric():
            for j in range(1, int(i) + 1, 1):
                tmp += temp
        else:
            temp = i
    print(tmp)