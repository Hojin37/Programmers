def solution(myString):
    answer = ''
    i = 0
    
    myString = myString.lower()
    
    while i < len(myString):
        if myString[i] == 'a':
            answer += 'A'
            i += 1
        else:
            answer += myString[i]
            i += 1
            
    return answer