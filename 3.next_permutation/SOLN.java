/*Given an array Arr[] of integers, rearrange the numbers of the given array into 
the lexicographically next greater permutation of numbers.
 * Input format: Arr[] = {1,3,2}
   Output: Arr[] = {2,1,3}
 */

//BRUTE FORCE//
//Step 1: Find all possible permutations of elements present and store them.

//Step 2: Search input from all possible permutations.

//Step 3: Print the next permutation present right after it.

//Eg.  All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. 
//So, the next permutation just after {1,3,2} is {2,1,3}.


//Time Complexity:  O(N!xN)
//Space Complexity: O(1)


//OPTIMAL
/*Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value. Store that index in a variable.

Step 3: Swap values present in indices found in the above two steps.

Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.
*/

class Solution {
  public void nextPermutation(int[] A) {
      if(A == null || A.length <= 1) return;
      int i = A.length - 2;
      while(i >= 0 && A[i] >= A[i + 1]) i--; 
      if(i >= 0) {                           
          int j = A.length - 1;              
          while(A[j] <= A[i]) j--;      
          swap(A, i, j);                     
      }
      reverse(A, i + 1, A.length - 1);      
}

public void swap(int[] A, int i, int j) {
  int tmp = A[i];
  A[i] = A[j];
  A[j] = tmp;
}

public void reverse(int[] A, int i, int j) {
  while(i < j) swap(A, i++, j--);
}
}

//Time Complexity: O(n)
//Space Complexity: O(1)