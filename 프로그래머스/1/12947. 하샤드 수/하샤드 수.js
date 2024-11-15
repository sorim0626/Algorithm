function solution(x) {
    var answer = 0;
    y = x.toString(); // toString은 원본 배열을 유지해서 y안에 넣어줬다~~!!
    for(let i = 0; i < y.length; i++) {
        answer += Number(y[i]);
    }
    if(x % answer == 0) {
        return true;
    }
    return false;
}