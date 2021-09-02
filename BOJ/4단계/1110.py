N = input()
if int(N) < 10:
  A = '0' + N
  print(A)
while True:
  A = int(A) / 10 + int(A) % 10
  print(N)