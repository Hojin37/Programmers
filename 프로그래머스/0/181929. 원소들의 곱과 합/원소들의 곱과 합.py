def solution(num_list):
    answer = 0
    i = 1
    
    for num in num_list:
        i *= num
    
    if i < sum(num_list) **2 :
        answer = 1
    
    return answer