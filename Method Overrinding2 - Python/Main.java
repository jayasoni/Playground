class Animal:
  def __init__(self):
    pass
  def breathe(self):
    print("I breathe oxygen")
  def food(self):
    print("I eat food")
class Herbivores(Animal):
  def __init__(self,a):
    self.a=a
  def food(self,a):
    print ("{} : I am a Vegetarian".format(self.a))
class Carnivores(Animal):
  def __init__(self,b):
    self.b=b
  def food(self,b):
    print ("{} : I am a Non Vegetarian".format(self.b))
class Omnivores(Animal):
  def __init__(self,c):
    self.c=c
  def food(self,c):
    print ("{} : I eat both".format(self.c))
x=input()
y=input()
z=input()
ob1=Herbivores(x)
ob2=Carnivores(y)
ob3=Omnivores(z)
ob1.food(x)
ob1.breathe()
ob2.food(y)
ob2.breathe()
ob3.food(z)
ob3.breathe()