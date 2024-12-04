def solution(myString, pat):
    index = ''
    
    #pat의 시작 및 끝 인덱스 구하기
    index = myString.rfind(pat)+len(pat)
    
    return myString[:index]