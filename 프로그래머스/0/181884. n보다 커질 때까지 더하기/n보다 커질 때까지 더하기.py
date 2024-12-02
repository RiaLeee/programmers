def solution(numbers, n):
    sumNumbers = 0
    
    for i in range(len(numbers)):
        sumNumbers += numbers[i]
        if sumNumbers > n:
            return sumNumbers
