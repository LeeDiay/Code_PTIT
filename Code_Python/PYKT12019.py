t=int(input())
while t>0:
    n=int(input())
    a=[int(i) for i in input().split()]
    l=[False]*n
    s=[]
    for i in range(n):
        while s and a[s[-1]]<=a[i]:
            s.pop()
        if not s:
            l[i]=True
        s.append(i)
    s=[]
    for i in reversed(range(n)):
        while s and a[s[-1]]>a[i]:
            s.pop()
        if s:
            l[i]=False
        s.append(i)
    print(l.count(True))
    t-=1