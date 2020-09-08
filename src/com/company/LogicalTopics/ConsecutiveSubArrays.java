/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gokul on Sep,2020,08-09-2020 at 15:52
 */
public class ConsecutiveSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        for (int a = 1; a <= arr.size(); a++) {
            for (int i = 0; i < arr.size() - (a - 1); i++) {
                for (int j = i; j < i + a; j++) {
                    System.out.print(arr.get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
