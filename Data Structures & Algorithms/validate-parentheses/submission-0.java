class Solution {
    public boolean isValid(String s) {

    Stack<Character> brackets =  new Stack<>();

    for(int i = 0; i < s.length(); i++){
        char b  = s.charAt(i);
        if(b == '(' || b == '{' || b == '['){
            brackets.push(b);
        }
        else{
            if(!brackets.isEmpty()){
                if(brackets.peek() == '(' && b == ')'){
                    brackets.pop();
                }
                else if(brackets.peek() == '{' && b == '}'){
                    brackets.pop();
                }
                else if(brackets.peek() == '[' && b == ']'){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }
    if(brackets.isEmpty()){
        return true;
    }
    return false;   
    }
}
