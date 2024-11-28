def solution(n, k):
    count = n // k
    answer = []
    
    for i in range(1,count+1):
        answer.append(k*i)
    
    return answer