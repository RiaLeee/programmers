def solution(n):
    if n%2 == 1:
        return[i for i in range(1,n+1,2)]
    else:
        return[i for i in range(1,n,2)]