def solution(a, b):
    
    answer = 0
    ab= int(str(a)+str(b))
    c= 2*a*b
    
    if ab>c : answer=ab
    elif ab==c : answer=ab
    else : answer=c
        
    return answer