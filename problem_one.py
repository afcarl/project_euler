summa = 0
for i in xrange(1000):
    if i%3==0:
        summa+= i
    else:
        if i%5==0:
            summa += i
print summa
