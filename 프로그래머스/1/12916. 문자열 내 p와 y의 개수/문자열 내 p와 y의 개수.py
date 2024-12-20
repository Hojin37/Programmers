def solution(s):
    us = s.upper()
    answer = us.count('P') == us.count('Y')

    return answer