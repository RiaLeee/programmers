def solution(num_list):
    # 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합
    # 10 이하이면 모든 원소의 곱
    
    if len(num_list) >= 11:
        return sum(num_list)
    else:
        result=1
        for i in num_list :
            result *= i
        return result