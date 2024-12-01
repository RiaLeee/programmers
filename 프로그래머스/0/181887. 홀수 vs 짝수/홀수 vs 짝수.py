def solution(num_list):
    #인덱스 짝수 = 홀수 번째 원소
    #인덱스 홀수 = 짝수 번째 원소
    #합 비교
    evensum = 0
    oddsum = 0
    
    for i,num in enumerate(num_list):
        if i%2==0:
            evensum += num
        else:
            oddsum += num
        
    if evensum > oddsum:
        return evensum
    else:
        return oddsum