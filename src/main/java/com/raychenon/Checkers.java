package com.raychenon;

/**
 * User: raychenon
 * Date: 2019-11-24
 */
public class Checkers {

    static final Character JafarPawn = 'O';
    static final Character AladdinPawn = 'X';

    /**
     * given a square board of N x N size describing Aladdin's and Jafar's pawns, returns the
     * maximum number of pawns Jafar can beat in one turn. If none of Aladdin's pawns can be
     * beaten, the function should return 0.
     *
     * @param board
     * @return maximum number of pawns owned by Aladdin that Jafar can beat in his turn.
     */
    public int countPawnsBeaten(String[] board) {
        int posX = 0, posY = 0;
        int N = board.length;
        int count = 0;

        // find the only Jafar's pawn
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (board[i].charAt(j) == JafarPawn) {
                    posX = j;
                    posY = i;
                }
            }
        }

        // possible moves

        // check if up right has X
        int posNextTop = posY - 2;
        int right = posX + 2;
        int left = posX - 2;
        if (posNextTop >= 0) {
            if (right < N && board[posNextTop].charAt(right) == AladdinPawn) {
                // up right
                ++count;
            } else if (left >= 0 && board[posNextTop].charAt(left) == AladdinPawn) {
                // up left
                ++count;
            }
        } else {
            return count;
        }

        return count;
    }
}
