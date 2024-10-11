def solution(n):
    answer = 2
    i = 1
    
    while i <= 1000:
        if i**2 == n:
            answer = 1
        i += 1
    
    return answer