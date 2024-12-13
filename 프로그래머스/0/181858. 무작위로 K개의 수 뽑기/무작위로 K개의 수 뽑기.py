def solution(arr, k):
    
    result = []
    for a in arr:
        if (a not in result and len(result) < k):
            result.append(a)
    
    if len(result) < k:
        while len(result) < k:
            result.append(-1)
    
    return result