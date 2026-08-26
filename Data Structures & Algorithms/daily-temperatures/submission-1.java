class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] res = new int[n];

        ArrayDeque<int[]> stack = new ArrayDeque<>(); // [temp, index]

        for(int i = 0; i < n; i++){
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]){

                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }

            stack.push(new int[]{t, i});
        }

        return res;
        
    }
}
