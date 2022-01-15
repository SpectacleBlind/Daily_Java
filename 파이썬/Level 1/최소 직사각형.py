def solution(sizes):
    mx, my = 0, 0
    for xy in sizes:
        x,y = min(xy), max(xy)
        if mx * my == 0 :
            mx, my = x, y
        else :
            mx, my = max(mx, x), max(my, y)
    return mx * my