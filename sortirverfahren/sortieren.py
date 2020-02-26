import random
def zufallsliste(n):
    liste = []
    for i in range(n):
        liste.append(i)
    for i in range(2*n):
        liste = tauschen(random.randrange(n),random.randrange(n),liste)
    return liste

def tauschen(a,b,liste):
    x = liste[a]
    liste[a] = liste[b]
    liste[b] = x
    return liste

def 
