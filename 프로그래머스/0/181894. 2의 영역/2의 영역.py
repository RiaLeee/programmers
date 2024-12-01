def solution(arr):
    # 2가 있는 가장 작은 인덱스 찾기
    start = -1
    end = -1
    
    for i in range(len(arr)):
        if arr[i]==2:
            if start == -1: #마지막 인덱스가 아니면
                start =i
            end =i
    
    #2가 하나도 없다면 -1 반환
    if start == -1 :
        return [-1]
    
    return arr[start:end+1]
                