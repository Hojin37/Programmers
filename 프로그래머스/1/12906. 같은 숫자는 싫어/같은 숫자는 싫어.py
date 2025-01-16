def solution(arr):
    answer = []
    i = 1
    
    while i < len(arr):
        if arr[i-1] != arr[i]:
            answer.append(arr[i-1])
        i += 1
        
    answer.append(arr[-1])
    
    return answer