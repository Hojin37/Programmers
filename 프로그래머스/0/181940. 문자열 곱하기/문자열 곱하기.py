def solution(my_string, k):
    answer = ''
    
    while k > 0:
        answer = answer + my_string
        k = k - 1
    
    return answer