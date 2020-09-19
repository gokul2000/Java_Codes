/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;

import java.util.Scanner;

/**
 * Created by Gokul on Sep,2020,19-09-2020 at 19:32
 */
public class RatMaze {
    private  static boolean safePath(int [][] paths,int row,int col){
        return (row<paths.length&&col<paths[0].length&&row>=0&&col>=0&&paths[row][col]==1);
    }
    private static boolean findPathSafety(int [][] arr,int[][] solution,int row,int col){
        if(row== arr.length-1&&col==arr[0].length-1&&arr[row][col]==1){
            solution[row][col]=1;
            return true;
        }
        if(safePath(arr,row,col)){
            solution[row][col]=1;
            if(findPathSafety(arr,solution,row+1,col)){
                return  true;
            }
            if(findPathSafety(arr,solution,row,col+1)){
                return true;
            }
            solution[row][col]=0;
        }
        return false;
    }
    private  static void findPath(int[][] paths,int n){
        int[][] solutionPath=new int[n][n];
        if(findPathSafety(paths,solutionPath,0,0)){
            printMatrix(solutionPath);
        }

    }

    private static void printMatrix(int[][] solutionPath) {
        for(int i=0;i<solutionPath.length;i++){
            for(int j=0;j<solutionPath[0].length;j++){
                System.out.print(solutionPath[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int [][] paths = new int [a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                paths[i][j]= sc.nextInt();
            }
        }
        findPath(paths,paths.length);



    }
}
