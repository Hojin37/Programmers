def solution(strArr):
    answer = []
    i = 0
    
    while i < len(strArr):
        if i % 2 == 0:
            answer.append(strArr[i].lower())
            i += 1
        else:
            answer.append(strArr[i].upper())
            i += 1
            
    return answer