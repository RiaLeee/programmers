def solution(myString):
    myString = myString.replace('a','A')
    
    result = ''.join(ch.lower() if ch!='A' else ch for ch in myString)
    return result