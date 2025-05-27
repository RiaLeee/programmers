def solution(num_list):
    odd=pair=0
    
    for n in num_list:
        if n%2==0:
            pair+=1
        else:
            odd+=1
    return [pair,odd]
