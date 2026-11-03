class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board[0].length;
        int n = board.length;

        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    int row = j + 3 * (i/3);
                    int col = k + 3 * (i%3);
                    if(board[row][col]=='.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
