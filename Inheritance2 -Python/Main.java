class Person:
  def __init__(self,name):
    self.name=name
  def display(self):
    print("Name of Person =",self.name)
class Staff(Person):
  def __init__(self,name,id):
    self.id=id
    self.name=name
  def display(self):
    print("Staff Id is  =",self.id)
class Temporarystaff(Staff):
  def __init__(self,day,hrs):
    self.day=day
    self.hrs=hrs
  def display(self):
    print("No. of Days =",self.day)
    print("No. of Hours Worked =",self.hrs)
  def Salary(self):
    print("Total Salary =",(self.day*self.hrs*150))

a=input()
b=int(input())
c=int(input())
d=int(input())
obj=Temporarystaff(c,d)
obj2=Staff(a,b)
obj1=Person(a)
obj1.display()
obj2.display()
obj.display()
obj.Salary()
