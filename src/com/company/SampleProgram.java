/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company;

import java.util.Scanner;


/**
 * Created by Gokul on Aug,2020,28-08-2020 at 06:44
 */
public class SampleProgram {
    public static void printMatrix(String [] [] matrix){
        int m=matrix.length;
        for (int i = 0; i < m; i++) {
            for (String str : matrix[i]) {
                System.out.print(str + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        String[][] matrix = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = "0";
            }
        }
        int red= scanner.nextInt();
        for(int i=0;i<red;i++){
            int index_i,index_j;
            index_i=scanner.nextInt();
            index_j=scanner.nextInt();
            matrix[index_i-1][index_j-1]="1R";
        }
        int black=scanner.nextInt();
        for(int i=0;i<black;i++){
            int index_i,index_j;
            index_i=scanner.nextInt();
            index_j=scanner.nextInt();
            matrix[index_i-1][index_j-1]="1B";
        }
        printMatrix(matrix);

    }
}
