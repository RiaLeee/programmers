def solution(arr):
    
    newSize = 1
    
    while newSize < len(arr):
        newSize *= 2
    
    result=[0]*newSize
    for i in range(len(arr)):
        result[i] = arr[i]
        
    return result