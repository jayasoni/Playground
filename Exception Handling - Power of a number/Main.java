class MyCalculator(Exception):
  def __init__(self,n,p):
    self.n=n
    self.p=p
  def power(self):
    t=(self.n)**(self.p)
    print(t)
try:
  a=int(input())
  b=int(input())
  ob=MyCalculator(a,b)
  #ob.power()
  raise ValueError
except ValueError:
  
  if(a==0 and b==0):
      print("n and p should not be zero.")
  elif(a<0 or b<0):
    print("n or p should not be negative.")
  else:
    ob.power()
    #  print("n or p should not be negative.")
  
  