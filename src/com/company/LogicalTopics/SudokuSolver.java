/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;
import java.util.*;

/**
 * Created by Gokul on Sep,2020,19-09-2020 at 16:46
 */
public class SudokuSolver {

      public static boolean sudoku(int[][] board, int n) {
            int row = -1;
            int col = -1;

            boolean isEmpty = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
                        row = i;
                        col = j;

                        isEmpty = false;
                        break;
                    }
                }
                if (!isEmpty) {
                    break;
                }
            }

            if (isEmpty) {
                return true;
            }

            for (int num = 1; num <= n; num++) {
                if (isSafePlace(board, row, col, num)) {

                    board[row][col] = num;

                    if (sudoku(board, n)) {
                        return true;
                    } else {
                        board[row][col] = 0;
                    }
                }
            }

            return false;
        }

        public static boolean isSafePlace(int[][] board, int row, int col, int num) {
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] == num) {
                    return false;
                }
            }

            for (int i = 0; i < board.length; i++) {
                if (board[i][col] == num) {
                    return false;
                }
            }

            int sqrt = (int) Math.sqrt(board.length);
            int rowStart = row - row % sqrt;
            int colStart = col - col % sqrt;

            for (int r = rowStart; r < rowStart + sqrt; r++) {
                for (int d = colStart; d < colStart + sqrt; d++) {
                    if (board[r][d] == num) {
                        return false;
                    }
                }
            }

            return true;
        }

        public static void printSudokuBoard(int[][] board, int N) {
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    System.out.print(board[row][col]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] board = new int[9][9];
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board[i][j]=sc.nextInt();
                }
            }
            int N = board.length;

            if (sudoku(board, N)) {
                printSudokuBoard(board, N);
            } else {
                System.out.println("No Solution Exists");
            }
        }

}
