class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            boolean[] seenRow = new boolean[9];
            boolean[] seenCol = new boolean[9];
            for(int j=0;j<9;j++){
                char r = board[i][j];
                if(r!='.'){
                    int idx =  r-'1';
                    if(seenRow[idx]) return false;
                    seenRow[idx] = true;
                }

                char c = board[j][i];
                if(c != '.'){
                    int idx = c - '1';
                    if(seenCol[idx]) return false;
                    seenCol[idx] = true;
                }
            }
        }

        for(int m=0;m<9; m+=3){
            for(int n=0;n<9;n+=3){
                boolean[] seenBox = new boolean[9];
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char val = board[m+i][n+j];
                        if(val != '.'){
                            int idx = val - '1';
                            if(seenBox[idx]) return false;
                            seenBox[idx] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
