/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;


import java.util.*;


/**
 * Created by Gokul on Sep,2020,09-09-2020 at 09:56
 */
public class BagsCount {
    static Map<Integer,Integer> map = new LinkedHashMap<>();
    static List<Integer> integerList;
    static List<Integer> resultInteger=new ArrayList<>();
    public static boolean checkWhetherFromAbove(int [][] matrix,int row,int col){
        if(row==0||col==0){
            return false;
        }
        if(matrix[row][col]==matrix[row-1][col]){
            return true;
        }
        return false;
    }
    public static void checkPresent(int [][] matrix, int row,int col){

            if (row < 0 || col <0) {
                return;
            }
            while (checkWhetherFromAbove(matrix, row, col)) {
                row--;
            }
            if(matrix[row][col]!=0)
            resultInteger.add(integerList.get(row));
            int minusFactor = integerList.get(row);
            int k = row - 1;
            int j = col - minusFactor;
            if(k<0||j<0)
                return;
            checkPresent(matrix, k,j);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();
        int N,C;
        N= sc.nextInt();C= sc.nextInt();
        int [][] matrix=new int[N][C+1];
        for(int i=0;i<N;i++){
            map.put(sc.nextInt(),sc.nextInt());
        }
        integerList = new ArrayList<>(map.keySet());
        for(int i=0;i<N;i++){
            for(int j=0;j<=C;j++){
                if(i==0){
                    if(j>=integerList.get(i)){
                        matrix[i][j]=map.get(integerList.get(i));
                    }
                    else{
                        matrix[i][j]=0;

                    }
                }
                else{
                    if(j>=integerList.get(i)){
                       matrix[i][j]=Math.max(matrix[i-1][j],(map.get(integerList.get(i))+matrix[i-1][j-(integerList.get(i))])) ;
                    }else{
                        matrix[i][j]=matrix[i-1][j];
                    }
                }
            }
        }

//        for(int i=0;i<N;i++){
//            for(int j=0;j<C+1;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        int result=matrix[N-1][C];
        int j=C;
        int i=N-1;
        while (i>=0){
            if(i==0){
                break;
            }
            if(checkWhetherFromAbove(matrix,i,j)){
                i--;
            }else{
                break;
            }
        }
        int rows=i;
        results.add(integerList.get(rows));
        boolean r=true;
        int columns=C;
        checkPresent(matrix,rows,columns);
        Collections.reverse(resultInteger);
        System.out.println(resultInteger);





    }
}
