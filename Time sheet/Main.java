sun=int(input())
mon=int(input())
tue=int(input())
wed=int(input())
thu=int(input())
fri=int(input())
sat=int(input())
sal=(sun+mon+tue+wed+thu+fri+sat)*100
if sun!=0:
  sal=sal+0.5*(sun*100)
if sat!=0:
  sal=sal+0.25*(sat*100)
if mon>8: 
  mon=mon-8
  sal=sal+mon*15
if tue>8: 
  tue=tue-8
  sal=sal+tue*15
if wed>8:
  wed=wed-8
  sal=sal+wed*15
if thu>8:
  thu=thu-8
  sal=sal+thu*15
if fri>8: 
  fri=fri-8
  sal=sal+fri*15
s=mon+tue+wed+thu+fri
if s>40:
  s=s-40
  sal=sal+s*25
print(sal)
