def solution(my_string, overwrite_string, s):
    answer = ''
    i = 0
    
    while i < len(my_string):
        if i == s:
            answer = answer + overwrite_string
            i = i + len(overwrite_string)
        else:
            answer = answer + my_string[i]
            i = i + 1
        
    return answer