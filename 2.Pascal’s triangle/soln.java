/*PASCAL'S TRIANGLE
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1          */

//each iteration put array[i][j] = array[i – 1][j – 1] + array[i – 1][j].

import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
    }
}

//Time Complexity: O(n^2)
//Space Complexity:O(n^2)


//for getting a element at a particular position
//do (r-1)C(c-1)


