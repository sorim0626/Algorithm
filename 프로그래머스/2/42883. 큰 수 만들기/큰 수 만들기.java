import java.util.Stack;

class Solution {
    public String solution(String number, int k) {        
        Stack<Character> stack = new Stack<>();
        
        for(char digit : number.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        while(k-- > 0) {
            stack.pop();
        }
        
        StringBuilder answer = new StringBuilder();
        for(char digit : stack) {
            answer.append(digit);
        }
        
        return answer.toString();
    }
}