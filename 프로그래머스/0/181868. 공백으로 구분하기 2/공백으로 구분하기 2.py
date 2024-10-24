def solution(my_string):
    answer = []
    str1 = ""
    i = 0
    
    while i < len(my_string):
        str1 += my_string[i]
        if my_string[i] == " ":
            if str1.strip() != "": 
                answer.append(str1.strip()) 
                str1 = ""  
        i += 1

    if str1.strip() != "":
        answer.append(str1.strip())
            
    return answer