class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> polish = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String c = tokens[i];
            if(c.equals("+")){
                polish.push(polish.pop() + polish.pop());
            }
            else if(c.equals("-")){
                int a = polish.pop();
                int b = polish.pop();
                polish.push(b - a);
            }
            else if(c.equals("*")){
                polish.push(polish.pop() * polish.pop());
            }
            else if(c.equals("/")){
                int a = polish.pop();
                int b = polish.pop();
                polish.push((int)(b / a));
            }
            else{
                polish.push(Integer.parseInt(c));
            }
        }
        return polish.pop();   
    }
}
