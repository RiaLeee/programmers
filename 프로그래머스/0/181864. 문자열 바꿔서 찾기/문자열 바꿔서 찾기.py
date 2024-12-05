def solution(myString, pat):
    answer = 0
    str = myString.replace('A','temp').replace('B','A').replace('temp','B')
    return 1 if pat in str else 0