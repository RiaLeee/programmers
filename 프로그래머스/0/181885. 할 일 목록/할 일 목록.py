def solution(todo_list, finished):
    # 마치지 못한 일들을 담을 리스트
    result = []
    
    # todo_list와 finished 배열을 순회하면서 아직 마치지 못한 일만 result에 추가
    for i in range(len(todo_list)):
        if not finished[i]:  # finished[i]가 False이면 아직 마치지 않은 일
            result.append(todo_list[i])
    
    return result
