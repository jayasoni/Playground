i = input()
i = i[1:]
i = i[:-1]
a = []
for tup in i.split('),('):
    #tup looks like `(a,a` or `b,b`
    tup = tup.replace(')','').replace('(','')
    #tup looks like `a,a` or `b,b`
    a.append(tuple(tup.split(',')))
   
tmp1 = []
tmp2 = []

for i in a:
    for j in i:
        j = int(j)
        tmp1.append(j)

for i in range(0,len(tmp1),2):
    ex = (tmp1[i],tmp1[i+1])
    tmp2.append(ex)

ouput = sorted(tmp2, key=lambda x: x[-1])
print(ouput)

