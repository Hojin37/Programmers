def solution(n, k):
    answer = 0
    answer += 12000 * n
    answer += 2000 * (k - (n//10))
    return answer