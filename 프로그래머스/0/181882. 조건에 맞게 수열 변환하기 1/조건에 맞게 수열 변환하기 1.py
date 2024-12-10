def solution(arr):
    answer = []
    i = 0
    n = len(arr)
    
    while n > 0:
        if arr[i] >= 50 and arr[i] % 2 == 0:
            answer.append(arr[i] / 2)
        elif arr[i] < 50 and arr[i] % 2 != 0:
            answer.append(arr[i] * 2)
        else:
            answer.append(arr[i])
        i += 1
        n -= 1
            
    return answer