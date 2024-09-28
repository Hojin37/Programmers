def solution(str1, str2):
    answer = ''
    i = 0
    while i < len(str1):
        answer = answer + str1[i] + str2[i]
        i = i + 1
        
    return answer