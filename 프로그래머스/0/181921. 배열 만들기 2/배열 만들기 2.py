def solution(l, r):
    
    result=[]
    
    for i in range(l,r+1):
        str_i = str(i)
        if all(c in '05' for c in str_i):
            result.append(i)
    
    if not result:
        return [-1]
    
    return result