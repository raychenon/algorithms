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

        // count the maximum pawns beaten in ONE turn.
        // Jafar has the additonal play when an opposing pawn is taken.
        int step1Top = posY - 1;
        while (posY >= 0 && step1Top >= 0) {
            step1Top = posY - 1;
            int step1right = posX + 1;
            int step1left = posX - 1;
            int step2Top = step1Top - 1;
            if (step1Top >= 0 && step2Top >= 0) {
                if (step1right < N && board[step1Top].charAt(step1right) == AladdinPawn) {
                    // up right
                    // check  if the 2 step up right is available
                    if ((step1right + 1 < N) && board[step2Top].charAt(step1right + 1) != AladdinPawn) {
                        ++count;
                        posX = posX + 2;
                    }
                } else if (step1left >= 0 && board[step1Top].charAt(step1left) == AladdinPawn) {
                    // up left
                    // check  if the 2 step up left is available
                    if ((step1left - 1 >= 0) && board[step2Top].charAt(step1left - 1) != AladdinPawn) {
                        ++count;
                        posX = posX - 2;
                    }
                }
            } else {
                return count;
            }
            posY = posY - 2;
        }

        return count;
    }
}
