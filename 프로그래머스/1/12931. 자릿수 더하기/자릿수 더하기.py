def solution(n):
    answer = 0
    m = len(str(n))
    i = 0
    
    while m > 0:
        answer += int(str(n)[i: i + 1])
        i += 1
        m -= 1
        
    return answer
