s = input()
count = 0
for i in range(len(s)):
    if s[i] == '4' or s[i] == '7':
        count = count + 1
    
if count == 4 or count == 7:
    print("YES")
else: print("NO")