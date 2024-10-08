function solution(num_list) {
    var answer = 0;
    var even = 0;
    var odd = 0;
    for(let i = 0; i < num_list.length; i++)
        {
            if(i % 2 == 0)
                {
                    even += num_list[i];
                }
            else
                {
                    odd += num_list[i];
                }
        }
    if(even > odd)
        {
            answer = even;
        }
    else
        {
            answer = odd;
        }
    return answer;
}