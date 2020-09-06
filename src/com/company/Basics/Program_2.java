/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.Basics;

/**
 * Created by Gokul on Aug,2020,29-08-2020 at 19:23
 */
import java.util.Scanner;
public class Program_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse().toString());



    }
}
