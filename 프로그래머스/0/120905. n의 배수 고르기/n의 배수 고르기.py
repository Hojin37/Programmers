def solution(n, numlist):
    answer = []
    i = 0
    while i < len(numlist):
        if numlist[i] % n == 0:
            answer.append(numlist[i])
        i += 1
    return answer