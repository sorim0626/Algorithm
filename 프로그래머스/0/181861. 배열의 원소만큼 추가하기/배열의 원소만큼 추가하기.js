function solution(arr) {
    var answer = [];
    for(let i = 0; i < arr.length; i++)
        {
            for(let j = 0; j < parseInt(arr[i]); j++)
                {
                    answer.push(parseInt(arr[i]));
                }
        }
    return answer;
}