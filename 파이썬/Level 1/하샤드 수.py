def solution(x):
    sum = 0
    for i in str(x):   # x 값 str로 만들기 
        sum += int(i)  # 각 자리수 더하기
    if x%sum == 0:     
        return True
    else:
        return False