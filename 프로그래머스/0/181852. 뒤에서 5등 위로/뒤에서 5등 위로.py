def solution(num_list):
    answer = []
    i = 5
    num_list.sort()
    
    while i < len(num_list):
        answer.append(num_list[i])
        i += 1
    
    return answer