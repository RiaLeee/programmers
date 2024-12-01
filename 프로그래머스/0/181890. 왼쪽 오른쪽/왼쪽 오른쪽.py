def solution(str_list):
    # 먼저 나오는 문자열이 "l"이라면, 해당 문자열을 기준으로 왼쪽에 있는 문자열 출력
    # 먼저 나오는 문자열이 "r"이라면, 해당 문자열을 기준으로 오른쪽에 있는 문자열 출력
    # "l"이나 "r"이 없다면 빈 리스트
    
    result = []
    
    for i in range(len(str_list)):
        if str_list[i] == 'l':
            result = str_list[:i]
            break
        elif str_list[i] == 'r':
            result = str_list[i+1:]
            break
    
    return result