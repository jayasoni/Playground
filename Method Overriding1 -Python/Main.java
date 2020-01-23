class RBI:
  def __init__(self,a):
    self.a=a
class SBI(RBI):
  def __init__(self,b):
    self.b=b
  def Interest(self):
    print("SBI Interest :",self.b)
class IndianBank(SBI):
  def __init__(self,c):
    self.c=c
  def Interest(self):
     print("IndianBank Interest :",(self.c))
class Canara(IndianBank):
  def __init__(self,d):
    self.d=d
  def Interest(self):
    print("Canara Bank Interest :",self.d)
a=float(input())
b=float(input())
c=float(input())
ob1=SBI(a)
ob2=IndianBank(b)
ob3=Canara(c)
ob1.Interest()
ob2.Interest()
ob3.Interest()

