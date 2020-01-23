try:
  a=int(input())
  b=int(input())
  print("{} // {}  =  {}".format(a,b,a//b))
except ZeroDivisionError:
  print("You cannot divide a number by zero")