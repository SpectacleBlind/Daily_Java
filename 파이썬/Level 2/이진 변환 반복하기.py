def solution(s):
    cnt1, cnt2=0, 0
    
    while s != '1':
        cnt1+=s.count('0')
        s=[i for i in s if i != '0'] 
        length=len(s)                  
        s=bin(length)[2:]          
        cnt2+=1				

    return [cnt2, cnt1]