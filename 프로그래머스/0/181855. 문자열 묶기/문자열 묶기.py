from collections import Counter

def solution(strArr):
    
    length=Counter(len(str) for str in strArr)
    return max(length.values())
