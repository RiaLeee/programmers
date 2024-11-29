def solution(arr):
    # 2가 있는 인덱스를 저장할 리스트
    positions = [i for i, num in enumerate(arr) if num == 2]
    
    # 2가 없다면 [-1]을 반환
    if not positions:
        return [-1]
    
    # 가장 작은 인덱스부터 가장 큰 인덱스까지 부분 배열을 반환
    return arr[positions[0]:positions[-1] + 1]