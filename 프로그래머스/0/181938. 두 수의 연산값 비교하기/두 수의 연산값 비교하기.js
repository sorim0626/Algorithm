function solution(a, b) {
    var answer = 0;
    var c = a.toString() + b.toString()
    if(c > 2 * a * b)
        {
            answer = parseInt(c);
        }
    else
        {
            answer = 2 * a * b;
        }
    return answer;
}