def solution(arr, intervals):
    result = []
    
    for interval in intervals:
        f,s=interval
        result += arr[f:s+1]
        
    return result