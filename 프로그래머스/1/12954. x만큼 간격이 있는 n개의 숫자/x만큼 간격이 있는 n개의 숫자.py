def solution(x, n):
    answer = []
    i = x
    
    while n > 0:
        answer.append(x)
        x += i
        n -= 1
    
    return answer