def solution(n):
    answer = 0
    i = 1
    even = 0
    odd = 0
    
    while i <= n:
        if i % 2 != 0:
            odd = odd + i
        else:
            even = even + (i * i)
        i = i + 1
        
    if n % 2 != 0:
        answer = odd
    else:
        answer = even
                
    return answer