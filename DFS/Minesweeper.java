package DFS;

/**
 * Created by shubham.goyal on 3/6/17.
 */
public class Minesweeper {


    public char[][] updateBoard(char[][] board, int[] click) {

        int i = click[0];
        int j = click[1];
        if (board[i][j] == 'M') {
            board[i][j] = 'X';
            return board;
        } else {

            int sum = countAdjacentMines(i, j, board);
            if (sum == 0) {
                board[i][j] = 'B';
                for (int x = i - 1; x <= i + 1; x++) {

                    for (int y = j - 1; y <= j + 1; y++) {

                        if((x == i && y == j)){
                            continue;
                        }
                        if (!(x < 0 || x >= board.length || y < 0 || y >= board[0].length))
                        {
                            if (board[x][y] == 'E')
                            {
                                updateBoard(board, new int[]{x,y});
                            }

                        }
                    }
                }
            } else {
                board[i][j] = (char) (sum + '0');
            }
        }
        return board;
    }

    public int countAdjacentMines(int i, int j, char[][] board) {
        if (i >= board.length || j >= board[0].length) {
            return 0;
        }

        int sum = 0;
        for (int x = i - 1; x <= i + 1; x++) {

            for (int y = j - 1; y <= j + 1; y++) {

                if((x == i && y == j)){
                    continue;
                }
                if (!(x < 0 || x >= board.length || y < 0 || y >= board[0].length))
                {
                    if (board[x][y] == 'M'|| board[x][y] == 'X')
                    {

                        sum++;
                    }

                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{"EEEEEEEE".toCharArray(),"EEEEEEEM".toCharArray(),"EEMEEEEE".toCharArray(),"MEEEEEEE".toCharArray(),
                "EEEEEEEE".toCharArray(),"EEEEEEEE".toCharArray(),"EEEEEEEE".toCharArray(),"EEMMEEEE".toCharArray()};
        int[] postion = new int[]{0, 0};
        Minesweeper obj = new Minesweeper();
        obj.updateBoard(board,postion);
    }
}
