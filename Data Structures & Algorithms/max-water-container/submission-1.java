class Solution {
    public int maxArea(int[] heights) {
        int areaMax = 0;
        int l = 0, r = heights.length - 1;
        while (l < r){
            int currArea = (r - l)*Math.min(heights[l], heights[r]);
            areaMax = Math.max(areaMax,currArea);
            if (heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        // for (int i = 0; i < heights.length - 1; i++){
        //     for (int j = i+1; j < heights.length; j++){
        //         int currArea = (j - i)*Math.min(heights[i], heights[j]);
        //         areaMax = Math.max(areaMax,currArea);
        //     }
        // }
        return areaMax;        
    }
}
