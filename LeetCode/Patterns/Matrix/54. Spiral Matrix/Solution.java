import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // 1. Traverse from left to right along the top row
            for (int col = left; col <= right; col++) {
                res.add(matrix[top][col]);
            }
            top++;
            
            // 2. Traverse from top to bottom along the right column
            for (int row = top; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }
            right--;
            
            // 3. Traverse from right to left along the bottom row
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    res.add(matrix[bottom][col]);
                }
                bottom--;
            }
            
            // 4. Traverse from bottom to top along the left column
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    res.add(matrix[row][left]);
                }
                left++;
            }
        }
        
        return res;
    }
}