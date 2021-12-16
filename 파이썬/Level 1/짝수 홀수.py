def solution(n):
    temp = n**0.5
    
    if(temp == int(temp)):
        return (temp+1)*(temp+1)
    else:
        return -1
