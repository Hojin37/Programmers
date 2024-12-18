def solution(n):
    answer = ''
    i = 0
    
    while n > i:
        if i % 2 == 0:
            answer += '수'
        else:
            answer += '박'
        i += 1
    
    return answer