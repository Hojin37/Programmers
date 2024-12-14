def solution(absolutes, signs):
    answer = 0
    i = 0
    
    while i < len(absolutes):
        if signs[i]:
            answer += absolutes[i]
        else:
            answer -= absolutes[i]
        i += 1
    
    return answer