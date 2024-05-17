import java.util.Arrays;
class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {


        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] lines = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        int y = 0;

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            lines[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int l = 0; l < 9; l++) {

            rows[l] = new HashSet<>();
            lines[l] = new HashSet<>();
            squares[l] = new HashSet<>();
            
            for (int c = 0; c < 9; c++) {



                char num = board[l][c];
                
                if (num != '.' && !lines[l].add(num)) {
                    System.out.println("line " + lines[l] + " num " + num);
                    return false;
                }

                if (num != '.' && !rows[c].add(num)) {
                    System.out.println("rows " + rows[c] + " num " + num);
                    return false;
                }

                y = (l / 3) * 3 + c / 3;

                if (num != '.' && !squares[y].add(num)) {
                    System.out.println("square " + squares[y] + " num " + num + " num square " + y);
                    return false;
                }
            }


            y = 0;
        }



        return true;

    }
}
