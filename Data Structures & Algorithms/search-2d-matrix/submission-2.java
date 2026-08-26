class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows  = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < rows; i++){
            if (target >= matrix[i][0]){
                int l = 0, r=col - 1;
                while(l <= r){
                    int m = l + ((r - l)/2) ;
                    if(target < matrix[i][m]){
                        r = m - 1;
                    }
                    else if (target > matrix[i][m]){
                        l = m + 1;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}

