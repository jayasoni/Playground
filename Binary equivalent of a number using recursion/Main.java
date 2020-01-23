'''a=int(input())
b=bin(a)
print(int(b[2:]))'''
def convert(n):
  if(n>1):
    convert(n//2)
  print(n%2,end=" ")
b=int(input())
convert(b)