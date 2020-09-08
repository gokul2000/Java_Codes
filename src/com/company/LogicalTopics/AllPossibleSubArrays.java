/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gokul on Sep,2020,08-09-2020 at 16:08
 */
public class AllPossibleSubArrays {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        for(int b=2;b<=5;b++){
            for(int i=0;i<=5-b;i++){

                for(int j=i+1;j<=5-(b-1);j++){
                    System.out.print(arr.get(i)+" ");
                    for(int k=j;k<j+(b-1);k++){
                        System.out.print(arr.get(k)+" ");
                    }
                    System.out.println();
                }

            }
        }
    }
}
