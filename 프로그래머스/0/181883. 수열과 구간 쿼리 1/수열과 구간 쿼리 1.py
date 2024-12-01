def solution(arr, queries):
    for s, e in queries:
        for i in range(s, e + 1):
            arr[i] += 1  # 구간 [s, e]의 원소들에 1을 더합니다.
    
    return arr
