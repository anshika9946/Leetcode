/*You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * Leetcode - https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * 1)Traverse whole array
 * 2)if string is a number push it to stack
 * 3)if you get an airthmatic operator pop to 2 elements from stack apply the operator and put the result to the stack
 */

package Microsoft;

import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer>st = new Stack<>();
        for(String s:tokens){
            if("+".equals(s)){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if("-".equals(s)){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }else if("*".equals(s)){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }else if("/".equals(s)){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}

//Time Complexity:O(N)
//Space Complexity: O(N)