def solution(numLog):
    answer = ''
    i = 1
    
    while i < len(numLog):
        if numLog[i-1] - numLog[i] == -1:
            answer += 'w'
            i += 1
        elif numLog[i-1] - numLog[i] == 1:
            answer += 's'
            i += 1
        elif numLog[i-1] - numLog[i] == -10:
            answer += 'd'
            i += 1
        else:
            answer += 'a'
            i += 1
    
    return answer