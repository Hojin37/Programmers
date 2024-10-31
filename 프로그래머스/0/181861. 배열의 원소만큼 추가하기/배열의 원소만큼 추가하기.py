def solution(arr):
    answer = []
    i = 0
    
    while i < len(arr):
        for _ in range(arr[i]):
            answer.append(arr[i])
        i += 1
    
    return answer