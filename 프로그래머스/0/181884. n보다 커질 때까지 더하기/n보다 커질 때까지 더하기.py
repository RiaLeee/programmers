def solution(numbers, n):
    total_sum = 0  # 누적 합을 저장할 변수
    
    # numbers 배열을 순회하며 누적 합을 구합니다.
    for num in numbers:
        total_sum += num  # 원소를 더합니다.
        
        # 만약 누적 합이 n보다 크면, 그 값을 바로 반환합니다.
        if total_sum > n:
            return total_sum
