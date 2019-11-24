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


        int step1Top = posY;
        int step1right = posX;
        int step1left = posX;
        step1Top = step1Top - 1;

        // count the maximum pawns beaten in ONE turn.
        // Jafar has the additonal play when an opposing pawn is taken.
        while (step1Top >= 0) {
            step1right = step1right + 1;
            step1left = step1left - 1;
            int step2Top = step1Top - 1;
            if (step1Top >= 0) {
                if (step1right < N && board[step1Top].charAt(step1right) == AladdinPawn) {
                    // up right
                    // check  if the 2 step up right is available
                    if (step2Top >= 0 && (step1right + 1 < N) && board[step2Top].charAt(step1right + 1) != AladdinPawn) {
                        ++count;
                    }
                } else if (step1left >= 0 && board[step1Top].charAt(step1left) == AladdinPawn) {
                    // up left
                    // check  if the 2 step up left is available
                    if (step2Top >= 0 && (step1left - 1 >= 0) && board[step2Top].charAt(step1left - 1) != AladdinPawn) {
                        ++count;
                    }
                }
            } else {
                return count;
            }
            step1Top = step1Top - 1;
        }

        return count;
    }
}
