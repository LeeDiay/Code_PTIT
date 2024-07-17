def count(s):
    cnt = 0
    for i in s:
        if i != ' ':
            cnt+=1
    return cnt
    
def check(s1, s2):
    return s2 in s1