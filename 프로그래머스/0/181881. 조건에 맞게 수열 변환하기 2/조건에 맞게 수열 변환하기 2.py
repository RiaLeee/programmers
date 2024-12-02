def solution(arr):
    count =0
    
    while True:
        preArr = arr[:]    
        arr = [i//2 if i >=50 and i%2==0 else(i*2+1 if i <50 and i%2!=0 else i) for i in arr]
        
        count += 1
        if arr == preArr:
            return count-1

