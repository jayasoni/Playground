class Calculator:
  def __init__(self,n1,n2):
    self.n1=n1
    self.n2=n2
  def add(self):
    tot1=self.n1+self.n2
    print("Addition : %d"%tot1)
  def sub(self):
    tot2=self.n1-self.n2
    print("Subtraction : %d"%tot2)
class AdvancedCalculator(Calculator):
  
  def mul(self):
    
    tot3=self.n1*self.n2
    print("Multiplication : %d"%tot3)
    
  def div(self):
    tot4=self.n1//self.n2
    print("Floor Division : %d"%tot4)
a=int(input())
b=int(input())
obj=AdvancedCalculator(a,b)
obj.add()
obj.sub()
obj.mul()
obj.div()