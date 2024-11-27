def solution(my_strings, parts):
    
    result=''
    
    for i in range(len(my_strings)):
        s,e = parts[i][0],parts[i][1]
        result +=  my_strings[i][s:e+1]   
    
    return result