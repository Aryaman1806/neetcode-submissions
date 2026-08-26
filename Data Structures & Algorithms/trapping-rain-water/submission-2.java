class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int lWall = 0, rWall = 0;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        for(int i = 0; i < n; i++){
            maxLeft[i] = lWall;
            lWall = Math.max(lWall, height[i]);
        }

        for(int i = n-1; i >=0; i--){
            maxRight[i] = rWall;
            rWall = Math.max(rWall, height[i]);
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            int pot = Math.min(maxRight[i], maxLeft[i]);
            sum += Math.max(0, pot - height[i]);
        }

        return sum;
        
    }
}
