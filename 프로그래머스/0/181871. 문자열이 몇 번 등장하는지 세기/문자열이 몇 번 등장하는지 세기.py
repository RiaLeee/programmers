def solution(myString, pat):
    count = 0 #빈도수 리턴값
    index = 0
    
    while True:
        index = myString.find(pat,index)
        if index == -1:
            break
        count +=1
        index +=1
        
    return count