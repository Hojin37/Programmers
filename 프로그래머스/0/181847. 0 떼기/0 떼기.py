def solution(n_str):
    answer = ''
    i = 0
    
    while i < len(n_str):
        if n_str[i] != "0":
            answer += n_str[i: len(n_str)]
            break
        i += 1   
    
    return answer