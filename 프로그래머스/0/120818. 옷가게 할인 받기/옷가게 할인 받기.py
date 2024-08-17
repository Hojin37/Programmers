def solution(price):
    answer = price
    if price >= 100000:
        answer = price * 95 // 100
    if price >= 300000:
        answer = price * 90 // 100
    if price >= 500000:
        answer = price * 80 // 100
    return answer