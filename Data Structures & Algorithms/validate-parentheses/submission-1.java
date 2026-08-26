class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){

            char b = s.charAt(i);

            if(b == '(' || b == '{' || b == '['){
                stack.push(b);
            }
            else{
                if(!stack.isEmpty()){
                    if(stack.peek() == '(' && b == ')'){
                        stack.pop();
                    }else if (stack.peek() == '{' && b == '}'){
                        stack.pop();
                    }else if (stack.peek() == '[' && b == ']'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
