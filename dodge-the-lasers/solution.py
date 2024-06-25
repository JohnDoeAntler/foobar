minus_sqrt2 = 4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727

def n1(n):
    return (minus_sqrt2*n)//(10**100)

def s(n):
    if n == 1:
        return 1
        
    if n < 1:
        return 0
    return n*n1(n) + n*(n+1)/2 - n1(n)*(n1(n)+1)/2 - s(n1(n))

def answer(n):
    n = long(n)
    return str(s(n))

# i was writing java code, but seems the verification is not working for java
# so i simply port the code to python2
import decimal
decimal.getcontext().prec = 101

sqrt2 = decimal.Decimal(2).sqrt()
helperConstant = sqrt2 - 1

def helper(n):
  current = n * helperConstant
  altered = int(current)
  return altered

def recurrence(a, n):
    if n == 1:
      return 1

    if n < 1:
      return 0

    h = helper(n)

    arg1 = n * h
    arg2 = n * (n + 1) / 2
    arg3 = h * (h + 1) / 2
    arg4 = recurrence(sqrt2, h)

    return arg1 + arg2 - arg3 - arg4

def solution(s):
    return str(recurrence(sqrt2, long(s)))

# tesitng

if __name__ == '__main__':
    print(solution('2'))
    print(solution('5'))
    print(solution('10000000000000000000000000000'))
    print(answer('10000000000000000000000000000'))
