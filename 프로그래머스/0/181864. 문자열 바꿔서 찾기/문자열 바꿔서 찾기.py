def solution(myString, pat):
    result = myString.replace('A','temp').replace('B','A').replace('temp','B')
    return 1 if pat in result else 0