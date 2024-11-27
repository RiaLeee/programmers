def solution(my_string, is_suffix):
    
    for i in range(len(my_string)):
        suffix = my_string[i:]
        if suffix==is_suffix:
            return 1
    return 0