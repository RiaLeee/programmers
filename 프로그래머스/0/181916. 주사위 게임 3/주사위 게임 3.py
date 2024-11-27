def solution(a, b, c, d):
    dice = [a,b,c,d]
    counts = [0]*7
    
    for num in dice:
        counts[num] += 1
    
    for i in range(1,7):
        if counts[i]==4 :
            return 1111*i
    
    for i in range(1,7):
        for j in range(1,7):
            if counts[i]==3 and counts[j]==1 and i != j:
                return (10*i+j) **2
            elif counts[i]==2 and counts[j]==2 and i != j:
                return (i+j)*abs(i-j)
    
    
    for i in range(1,7):
        for j in range(1,7):
            for r in range(1,7):
                if counts[i]==2 and counts[j]==1 and counts[r]==1 and j != r:
                    return j*r
    

    return min(dice) 