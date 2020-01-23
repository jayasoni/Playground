a = list(input())

b = []

for i in a:
    if i not in b:
        b.append(i)
b.sort()
for i in b:
    print(i,str(a.count(i)))