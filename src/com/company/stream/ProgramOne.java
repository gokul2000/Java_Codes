/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.stream;

import java.util.Arrays;

/**
 * Created by Gokul on Sep,2020,03-09-2020 at 09:12
 */
/**
 * Stream examples for converting int array to Integer array and vice versa*/
public class ProgramOne {
    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3,4,5};
        Integer array[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        int arrays[] = Arrays.stream(array).mapToInt(i->i.intValue()).toArray();
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j:arrays){
            System.out.print(j+" ");
        }
        System.out.println();
        for(Integer k:array){
            System.out.print(k+" ");
        }
    }
}
