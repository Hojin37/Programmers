def solution(a, b):
    answer = 0
    even = [2, 4, 6]
    odd = [1, 3, 5]
    
    if a in odd and b in odd:
        answer = a**2 + b**2
    elif a in even and b in even:
        answer = abs(a - b)
    else:
        answer = 2 * (a + b)
    
    return answer