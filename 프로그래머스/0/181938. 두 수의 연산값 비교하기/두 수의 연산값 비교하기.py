def solution(a, b):
    answer = 0
    Ea = int(str(a) + str(b))
    Eb = 2 * a * b
    
    if Ea > Eb:
        answer = Ea
    else:
        answer = Eb
        
    return answer