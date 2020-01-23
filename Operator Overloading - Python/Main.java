class GridPoint:
  def __init__(self,x,y):
    self.x=x
    self.y=y
  def __str__(self):
    return "{0},{1}".format(self.x,self.y)
        
  def __add__(self,other):
    x = self.x + other.x
    y = self.y + other.y
    return GridPoint(x,y)
       
a=int(input())
b=int(input())
c=int(input())
d=int(input())
ob1=GridPoint(a,b)
ob2=GridPoint(c,d)
print(ob1+ob2)
