function solution(my_string, is_suffix) {
    var answer = 1;
    for(let i = 0; i < is_suffix.length; i++)
        {
            if(my_string[my_string.length - is_suffix.length + i] !== is_suffix[i])
                {
                    return 0;
                }
        }
    return answer;
}