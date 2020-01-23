'''
global tmpls
tmpls = []

tmpls.append(0)
tmpls.append(1)

def fib(n):
    
    for i in range(n-2):
        tmpls.append(tmpls[i]+tmpls[i+1])
        
    
    print(*tmpls, sep='\n')


a = int(input())
fib(a)    
    '''

nt = int(input())
def refib(n):
    if n <= 1:
        return n
    else:
        return(refib(n-1) + refib(n-2))
        

for i in range(nt):
    print(refib(i))

