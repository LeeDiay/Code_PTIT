with open('A.txt') as file_a, open ('B.txt') as file_b:
    for line_a, line_b in zip(file_a, file_b):
        try:
            res = int(line_a.strip()) ** int(line_b.strip())
            print(res)
        
        except ValueError:
            print('Tep chua dong khong phai dinh dang so')
        
