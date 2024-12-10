import re
def solution(myStr):
    
    parts = re.split('[abc]',myStr)
    result = [part for part in parts if part]
    
    return result if result else ["EMPTY"]