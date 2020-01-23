try:
  n=int(input())
  l=[]
  sum=0
  for i in range(0,n):
    e=int(input())
    l.append(e)
  a=int(input())
  b=int(input())
  for i in range(a,b):
    sum=sum+l[i]
  print("Sum of numbers in the given range = {}".format(sum))
except IndexError:
  print("list index out of range")