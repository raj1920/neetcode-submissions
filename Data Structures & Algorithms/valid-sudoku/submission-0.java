class Solution {
    public boolean isValidSudoku(char[][] board) {

        // row wise check
       for(int i=0;i<9;i++){
        int[] seenRow= new int[10];
        int[] seenCol= new int[10];
        Arrays.fill(seenRow, 1);
        Arrays.fill(seenCol, 1);
        for(int j=0;j<9;j++){
            //row wise 
            if(board[i][j]!='.'){
                int ele= board[i][j]-'0';
                if(seenRow[ele]>0){
                   seenRow[ele]--; 
                }else{
                    return false;
                }
            } 
            //column wise
            if(board[j][i]!='.'){
                int ele= board[j][i]-'0';
                if(seenCol[ele]>0){
                   seenCol[ele]--; 
                }else{
                    return false;
                }
            }



        }
      }

      // cell wise check
      for(int blockRow=0;blockRow<9;blockRow+=3){
        for(int blockCol=0;blockCol<9;blockCol+=3){
         
          int[] seenCell = new int[10];
          Arrays.fill(seenCell,1);

          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int r = blockRow + i; // Actual row index on board
                int c = blockCol + j; // Actual column index on board

                if (board[r][c] != '.') {
                int ele = board[r][c] - '0'; // Safe char-to-iconversion
                    
                    if (seenCell[ele] > 0) {
                        seenCell[ele]--;
                    } else {
                        return false;
                    }
                }

            }
          }

        }
      }


    return true;
    }
}
