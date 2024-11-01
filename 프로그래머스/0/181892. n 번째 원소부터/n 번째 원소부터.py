def solution(num_list, n):
    answer = []
    
    while n-1 < len(num_list):
        answer.append(num_list[n-1])
        n += 1
    
    return answer