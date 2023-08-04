class Solution {
    public boolean isValidSudoku(char[][] board) {
          for(int i=0; i<9; i++)
        {
            HashSet<Character> r= new HashSet<>();
            HashSet<Character> c= new HashSet<>();
            HashSet<Character> e= new HashSet<>();
            for(int j=0; j<9; j++)
            {
            if(board[i][j]!='.' && !r.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !c.add(board[j][i]))
                return false;
            int ri=3*(i/3);
            int ci = 3*(i%3);
            if(board[ri+j/3][ci+j%3]!='.' && !e.add(board[ri + j/3][ci + j%3]))
                return false; 
        }
        }
        return true;
    }
}