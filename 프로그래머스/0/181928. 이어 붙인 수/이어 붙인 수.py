def solution(num_list):
    answer = 0
    even = ''
    odd = ''
    i = 0
    
    while i < len(num_list):
        if num_list[i] % 2 == 0:
            even += str(num_list[i])
            i += 1
        else:
            odd += str(num_list[i])
            i += 1
    
    answer = int(even) + int(odd)
    
    return answer