try:
  n=int(input())
  m=int(input())
  if n>18 and m>55:
    print("Can donate blood")
  else:
    raise ValueError;
except ValueError:
  print("Not eligible to donate blood")