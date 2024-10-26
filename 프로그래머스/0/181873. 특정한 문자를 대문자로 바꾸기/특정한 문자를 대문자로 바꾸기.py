def solution(my_string, alp):
    answer = ''
    i = 0
    
    while i < len(my_string):
        if my_string[i] == alp:
            answer += alp.upper()
            i += 1
        else:
            answer += my_string[i]
            i += 1
    
    return answer