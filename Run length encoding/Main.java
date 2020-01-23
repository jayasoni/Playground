a = list(input())

b = []

final = ''

for i in a:
    if i not in b:
        b.append(i)

for i in b:
    final += i
    final += str(a.count(i))
    
print(final)