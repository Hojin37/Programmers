def solution(n):
    answer = []
    while n>0:
        if n%2 != 0:
            answer.append(n)
        n -= 1
    answer.sort()
    
    return answer