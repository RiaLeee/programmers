def solution(arr, queries):
    
    result=[]
    
    for query in queries:
        s,e,k=query
        
        min_value = float('inf')
        for i in range(s,e+1):
            if(arr[i]>k):
                min_value = min(min_value,arr[i])
        
        if(min_value == float('inf')):
            result.append(-1)
        
        else: result.append(min_value)

    return result