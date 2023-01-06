//just reducing space complexity using prev method only
//using first row and column of same matrix instead of using dummy arrays

class Solution {
    public void setZeroes(int[][] matrix) {
 int col0 = 1, rows = matrix.length, cols = matrix[0].length;
//checking and putting 0 in dummy array
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;   //chacking for 0 column
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)          
                    matrix[i][0] = matrix[0][j] = 0;
        }
//traversing from back and putting 0 where =ver dummy arr shows 0
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}

//Time Complexity: O(2*(N*M))
//Space Complwxity: O(1)