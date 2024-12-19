def solution(arr, n):
    #arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열
    #arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열
    result = []
    
    if len(arr) % 2 != 0:
        for i,val in enumerate(arr):
            if i%2==0:
                result.append(val+n)
            else:
                result.append(val)
    else:
        for i,val in enumerate(arr):
            if i%2!=0:
                result.append(val+n)
            else:
                result.append(val)
                

    return result