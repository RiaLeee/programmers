def solution(myString):
    result=[]
    answer = myString.split('x')
    
    for i in answer:
        result.append(len(i))
    
    return result