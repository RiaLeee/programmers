def solution(my_string, indices):
    #큰 인덱스로 문자열 정렬 > 배열 순회해서 삭제 > 배열을 리스트로 만들어서 pop()사용
    indices.sort(reverse=True)
    answer = list(my_string)
        
    for i in indices:
        answer.pop(i)
    
    return ''.join(answer)