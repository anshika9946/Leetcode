//Instead of traversing through each row and column, we can use dummy arrays

import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) 
    {
         int rows = matrix.length, cols = matrix[0].length;
//two dummy arrays of size of row and column         
  int dummy1[]=new int[rows];
  int dummy2[]=new int[cols];
  Arrays.fill(dummy1,-1);
  Arrays.fill(dummy2,-1);
//If matrix[i][j]==0 then set dummy1[i]=0(for row) and dummy2[j]=0(for column).
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (matrix[i][j] == 0) {
        dummy1[i] = 0;
        dummy2[j] = 0;
      }
    }

  }
 // traverse through the array again and if dummy1[i]==0  || dummy2[j]==0 then arr[i][j]=0,else continue.
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if (dummy1[i] == 0 || dummy2[j]==0) {
        matrix[i][j] = 0;
      }
    }
  }
}
}


//Time Complexity: O(N*M + N*M)
//Space Complexity: O(N+M)
