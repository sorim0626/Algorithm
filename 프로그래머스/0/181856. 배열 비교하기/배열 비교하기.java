class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1sum = 0;
        int a2sum = 0;
        if(arr1.length > arr2.length) {
            answer = 1;
        }
        else if(arr1.length < arr2.length) {
            answer = -1;
        }
        else if(arr1.length == arr2.length) {
            for(int i = 0; i < arr1.length; i++) {
                a1sum += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++) {
                a2sum += arr2[i];
            }
            if(a1sum > a2sum)
                answer = 1;
            else if(a1sum < a2sum)
                answer = -1;
            else
                answer = 0;
        }
        return answer;
    }
}