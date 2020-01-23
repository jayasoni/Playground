a = list(map(str,input().split()))

b = []

for i in a:
    if i not in b:
        b.append(i)

for i in b:
    print(i,':',str(a.count(i)))