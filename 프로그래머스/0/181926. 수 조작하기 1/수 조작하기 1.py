def solution(n, control):
    answer = n
    i = 0
    
    while i < len(control):
        if control[i] == 'w':
            answer += 1
            i += 1
        elif control[i] == 's':
            answer -= 1
            i += 1
        elif control[i] == 'd':
            answer += 10
            i += 1
        else:
            answer -= 10
            i += 1
    
    return answer