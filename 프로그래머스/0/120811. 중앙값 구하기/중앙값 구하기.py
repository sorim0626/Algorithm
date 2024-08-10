def solution(array):
    array.sort()
    a = len(array) / 2
    b = int(a)
    answer = array[b]
    return answer