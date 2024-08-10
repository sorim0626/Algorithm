def solution(array):
    array.sort()
    a = len(array) / 2 # / 연산자는 float 형태. // 연산자는 정수 형태
    b = int(a)
    answer = array[b]
    return answer
